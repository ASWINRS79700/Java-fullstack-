package in.stackroute.ust.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.PushBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/todos")

public class ToDoController {
    List<ToDo> toDoList=new ArrayList<>();
    @GetMapping
    public List<ToDo> getAll(){
        return toDoList;
    }
    @GetMapping("/{id}")
    public Optional<ToDo> getTodo(@PathVariable int id){
        return toDoList.stream().filter(t->t.getId()==id).findFirst();
    }
    @PostMapping
    public void create(@RequestBody ToDo todo ){
        toDoList.add(todo);
        getAll();
    }
    @PutMapping("/{id}")
    public void update(@RequestBody ToDo todo,@PathVariable int id){
        for (ToDo t:toDoList
             ) {
            if(t.getId()==id){
                t.setId(id);
                t.setReminder(todo.getReminder());
                t.setStatus(todo.getStatus());
            }
        }
        getAll();
    }
    @DeleteMapping("/{id}")
    public  void delete(@PathVariable int id)
    {
        int i=0;
        for (ToDo t:toDoList
        ) {
            i++;
            if(t.getId()==id){
                toDoList.remove(t);
            }
        }
        getAll();
    }
    }
//    toDoList.stream().filter(todos->todos.id()==id).findFirst().oeElseThrow()




