package in.stackroute.ust.service;

import in.stackroute.ust.domain.Course;

import java.util.Optional;

public interface CourseService {

    Optional<Course> findByCode(String code);

    Course save(Course course);
}
