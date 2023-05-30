package in.stackroute.ust.service;

import in.stackroute.ust.Domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User user);
    User update(User user);
    void deleteById(long id);

    Optional<User> findById(long id);

    List<User> findAll();
}
