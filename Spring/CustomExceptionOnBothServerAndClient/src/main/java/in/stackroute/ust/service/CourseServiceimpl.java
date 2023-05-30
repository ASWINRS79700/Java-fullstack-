package in.stackroute.ust.service;

import in.stackroute.ust.domain.Course;
import in.stackroute.ust.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseServiceimpl implements CourseService {
    private CourseRepository courseRepository;

    public CourseServiceimpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Optional<Course> findByCode(String code) {
        return courseRepository.findById(code);
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }
}
