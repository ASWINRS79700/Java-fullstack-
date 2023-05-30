package in.stackroute.ust.controller;

import in.stackroute.ust.domain.Course;
import in.stackroute.ust.dto.CourseDto;
import in.stackroute.ust.dto.ExceptionResponseDto;
import in.stackroute.ust.exceptions.CourseAlreadyExistsException;
import in.stackroute.ust.exceptions.CourseNotFoundException;
import in.stackroute.ust.service.CourseService;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/v1/courses")
public class CourseController {

    private CourseService courseService;

    private final Logger logger = LoggerFactory.getLogger(CourseController.class);

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // GET /api/v1/courses?code=code
    @GetMapping("")
    public ResponseEntity<CourseDto> getCourseByCode(@RequestParam String code) {
        final var optionalCourse = courseService.findByCode(code);
        if (optionalCourse.isEmpty()){
            logger.error("Course with code " + code + " not found.");
            throw new CourseNotFoundException("Course with code " + code + " not found.");
        }
        logger.info("Course with code " + code + " found.");
        final var responseDto = toDto(optionalCourse.get());
        return ResponseEntity.status(HttpStatus.OK).body(responseDto);
    }

    // POST /api/v1/courses
    @PostMapping("")
    public ResponseEntity<CourseDto> createCourse(@RequestBody CourseDto courseDto) {
        final var optionalCourse = courseService.findByCode(courseDto.code());
        if(optionalCourse.isPresent()) {
            logger.error("Course with code " + courseDto.code() + " already exists.");
            throw new CourseAlreadyExistsException("Course with code " + courseDto.code() + " already exists.");
        }
        final var course = toEntity(courseDto);
        final var savedCourse = courseService.save(course);
        final var responseDto = toDto(savedCourse);
        logger.info("Course with code " + courseDto.code() + " created.");
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

    @ExceptionHandler(CourseNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ExceptionResponseDto> handleCourseNotFoundException(CourseNotFoundException ex) {
        final var exceptionResponseDto = new ExceptionResponseDto(ex.getMessage(), LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionResponseDto);
    }

    @ExceptionHandler(CourseAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<ExceptionResponseDto> handleCourseAlreadyExistsException(CourseAlreadyExistsException ex) {
        final var exceptionResponseDto = new ExceptionResponseDto(ex.getMessage(), LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(exceptionResponseDto);
    }

    private Course toEntity(CourseDto courseDto) {
        return new Course(courseDto.code(), courseDto.name(), courseDto.description());
    }

    private CourseDto toDto(Course course) {
        return new CourseDto(course.getCode(), course.getName(), course.getDescription());
    }

}
