package in.stackroute.ust.repository;

import in.stackroute.ust.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
}
