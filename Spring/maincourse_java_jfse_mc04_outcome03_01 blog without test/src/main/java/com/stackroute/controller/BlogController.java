package com.stackroute.controller;



import com.stackroute.domain.Blog;
import com.stackroute.dto.BlogDto;
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
@RequestMapping("/api/v1/blogs")
public class BlogController {

    /* Provide implementation code for these methods */

    private BlogService blogService;
    public BlogController(BlogService blogServiceImpl) {
        this.blogService = blogServiceImpl;
    }

    /*This method should save blog and return savedBlog Object */


    public BlogDto createDto(Blog blog){
        return new BlogDto(blog.getBlogId(), blog.getBlogTitle(), blog.getBlogContent(), blog.getAuthorName());
    }
    public Blog backtoBlog(BlogDto dto){
        return new Blog(dto.getBlogId(), dto.getBlogTitle(), dto.getBlogContent(), dto.getAuthorName());
    }
    @PostMapping("")
    public ResponseEntity<Blog> saveBlog(@RequestBody BlogDto blog) {
        final var blogO=backtoBlog(blog);
        final var createdBlog = blogService.saveBlog(blogO);
        final var dto = createDto(blogO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBlog);
    }

    /*This method should fetch all blogs and return the list of all blogs */
    @GetMapping("")
    public ResponseEntity<List<BlogDto>> getAllBlogs() {
        var blogs=blogService.getAllBlogs();
        if (blogs.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        final var blogDtoList = blogs.stream().map(this::createDto).collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(blogDtoList);
    }

    /*This method should fetch the blog taking its id and return the respective blog */
   @GetMapping("/{id}")
    public ResponseEntity<BlogDto> getBlogById(@PathVariable int id){
        Optional<Blog> blog= Optional.ofNullable(blogService.getBlogById(id));
        if(blog.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        BlogDto blogDto=createDto(blog.get());
        return ResponseEntity.status(HttpStatus.OK).body(blogDto);
    }

    /*This method should delete the blog taking its id and return the deleted blog */
    @DeleteMapping("/{id}")
    public ResponseEntity<BlogDto> getBlogAfterDeleting(@PathVariable int id) {

        Optional<Blog> blog=Optional.ofNullable(blogService.getBlogById(id));

        BlogDto  blogDto=createDto(blogService.deleteBlog(id));
        return ResponseEntity.status(HttpStatus.OK).body(blogDto);


    }

    /*This method should update blog and return the updatedBlog */
    @PutMapping("/{id}")
    public ResponseEntity<BlogDto> updateBlog(@RequestBody BlogDto blogDto,@PathVariable int id) {
        Blog blog=backtoBlog(blogDto);
        Optional<Blog> bb= Optional.ofNullable(blogService.updateBlog(blog));
        if(bb.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        Blog blog1=blogService.getBlogById(blog.getBlogId());
        BlogDto blogDto1=createDto(bb.get());
        return ResponseEntity.status(HttpStatus.OK).body(blogDto1);
    }
}