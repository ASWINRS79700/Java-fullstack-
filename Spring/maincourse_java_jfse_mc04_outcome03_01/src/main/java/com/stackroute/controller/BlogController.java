package com.stackroute.controller;



import com.stackroute.domain.Blog;

import com.stackroute.service.BlogService;
import com.stackroute.service.BlogServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/* Add annotation to declare this class as REST Controller */
@RestController
@RequestMapping("/api/v1")
public class BlogController {

    /* Provide implementation code for these methods */

    private BlogService blogService;
    public BlogController(BlogService blogServiceImpl) {
        this.blogService = blogServiceImpl;
    }

    /*This method should save blog and return savedBlog Object */



    @PostMapping("/blog")
    public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog) {
        final var b= blogService.getBlogById(blog.getBlogId());
        if(b !=null){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        final var createdBlog = blogService.saveBlog(blog);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBlog);
    }

    /*This method should fetch all blogs and return the list of all blogs */
    @GetMapping("/blogs")
    public ResponseEntity<List<Blog>> getAllBlogs() {
        var blogs=blogService.getAllBlogs();
        if (blogs.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(blogs);
    }

    /*This method should fetch the blog taking its id and return the respective blog */
   @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable int id){
        Optional<Blog> blog= Optional.ofNullable(blogService.getBlogById(id));
        if(blog.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(blogService.getBlogById(id));
    }

    /*This method should delete the blog taking its id and return the deleted blog */
    @DeleteMapping("/blog/{id}")
    public ResponseEntity<Blog> getBlogAfterDeleting(@PathVariable int id) {


        blogService.deleteBlog(id);
        return ResponseEntity.status(HttpStatus.OK).build();


    }

    /*This method should update blog and return the updatedBlog */
    @PutMapping("/blog")
    public ResponseEntity<Blog> updateBlog(@RequestBody Blog blog) {

        Optional<Blog> bb= Optional.ofNullable(blogService.updateBlog(blog));
        if(bb.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        Blog blog1=blogService.getBlogById(blog.getBlogId());
        return ResponseEntity.status(HttpStatus.OK).body(blog);
    }
}