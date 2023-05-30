package in.stackroute.ust.Controller;

import in.stackroute.ust.Domain.User;
import in.stackroute.ust.Repository.UserRepository;
import in.stackroute.ust.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")

public class UserController {
    private UserService userService;
    public UserController(UserService userRepository) {
        this.userService = userRepository;
    }

    @PostMapping("")
    public ResponseEntity<User> saveBlog(@RequestBody User user) {
        final var userd =userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userd);
    }
    @GetMapping("")
    public ResponseEntity<List<User>> getAll(){
        List<User> users=userService.findAll();
        if (users.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }
    @GetMapping("/{id}")
    public  ResponseEntity<User> getById(@PathVariable long id){
        Optional<User> user=userService.findById(id);
        if (user.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(user.get());
    }
    @PutMapping("/{id}")
    public  ResponseEntity<User> update(@RequestBody User u ,@PathVariable long id){
        var user=userService.findById(id);
        if (user.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        User use=user.get();
        use.setId(u.getId());
        use.setName(u.getName());
        use.setEmail(u.getEmail());
        use.setPassword(u.getPassword());
        userService.update(use);
        return ResponseEntity.status(HttpStatus.OK).body(use);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteById(@PathVariable long id){
        final var userOptional = userService.findById(id);
        if(userOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        userService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
