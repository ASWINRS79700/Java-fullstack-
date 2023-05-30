package com.stackroute.service;


import com.stackroute.domain.Blog;
import com.stackroute.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/* Add annotation to declare this class as Service class.
 * Also, it should implement BlogService Interface and override all the implemented methods.*/
@Service
public class BlogServiceImpl implements BlogService{
BlogRepository blogRepository;

    public BlogRepository getBlogRepository() {
        return blogRepository;
    }

    public void setBlogRepository(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public Blog saveBlog(Blog blog) {
        var b=blogRepository.findById(blog.getBlogId());
        if(b.isPresent()){
            return b.get();
        }
        blogRepository.save(blog);
        b=blogRepository.findById(blog.getBlogId());
        return blogRepository.findById(blog.getBlogId()).get();

    }

    @Override
    public List<Blog> getAllBlogs() {

        return blogRepository.findAll();
    }

    @Override
    public Blog getBlogById(int id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public Blog deleteBlog(int id) {
        var blog11=blogRepository.findById(id);
        if(blog11.isEmpty()){
            return null;
        }
        var res=blogRepository.findById(id);

        blogRepository.deleteById(id);
        return res.get();
    }

    @Override
    public Blog updateBlog(Blog blog) {
        var blog11=blogRepository.findById(blog.getBlogId());
        if(blog11.isEmpty()){
            return null;
        }
        var blog12=blogRepository.findById(blog.getBlogId());

        blogRepository.save(blog);
        return blog;
    }
}
