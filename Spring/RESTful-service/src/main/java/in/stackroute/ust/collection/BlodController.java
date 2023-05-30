package in.stackroute.ust.collection;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/blog")


public class BlodController {
    List<Blog>blogs=new ArrayList<>();

    @GetMapping
    public List<Blog> getAll(){
        return blogs;
    }
    @GetMapping("/{id}")
    public Optional<Blog> getTodo(@PathVariable int id){
        return blogs.stream().filter(t->t.getId()==id).findFirst();
    }
    @PostMapping
    public void create(@RequestBody Blog blg ){
        blogs.add(blg);
        getAll();
    }
    @PutMapping("/{id}")
    public void update(@RequestBody Blog blog,@PathVariable int id){
        for (Blog t:blogs
        ) {
            if(t.getId()==id){
                t.setId(id);
                t.setContent(blog.getContent());
                t.setDate(blog.getDate());
            }
        }
        getAll();
    }
    @DeleteMapping("/{id}")
    public  void delete(@PathVariable int id)
    {
        int i=0;
        for (Blog t:blogs
        ) {
            i++;
            if(t.getId()==id){
                blogs.remove(t);
            }
        }
        getAll();
    }
}
