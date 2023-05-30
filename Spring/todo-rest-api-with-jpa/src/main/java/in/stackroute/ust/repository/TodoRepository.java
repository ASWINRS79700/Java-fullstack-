package in.stackroute.ust.repository;

import in.stackroute.ust.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//@Repository - this is not required
public interface TodoRepository extends JpaRepository<Todo,Integer> {
}
