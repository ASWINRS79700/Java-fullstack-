package controller;

import domain.Author;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "api/v1/author")

public class Controller {





    private static List<Author> authorList = List.of(
            new Author("aswin@797", "Item 1", "Item 1 description"),
            new Author("robi@797", "Robi", "Item 2 description"),
            new Author("Rhit@", "Rohit", "Item 3 description"),
            new Author("Anju@", "Anju 4", "Item 4 description"),
            new Author("I005", "Item 5", "Item 5 description")
    );



    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Author author){
        authorList.add(author);
        return ResponseEntity.status(HttpStatus.CREATED).body(author);
    }
    @GetMapping("/{name}")
    public  ResponseEntity<?> get(@PathVariable String name){
        var res=authorList.stream().filter(a->a.getFullName()==name).collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.FOUND).body(res);
    }



}
