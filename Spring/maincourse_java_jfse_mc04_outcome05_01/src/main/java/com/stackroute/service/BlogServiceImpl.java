package com.stackroute.service;

import com.stackroute.domain.Blog;
import com.stackroute.exception.BlogAlreadyExistsException;
import com.stackroute.exception.BlogNotFoundException;
import com.stackroute.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class BlogServiceImpl implements BlogService {

        BlogRepository blogRepository;
        public BlogServiceImpl (BlogRepository blogRepository){
            this.blogRepository =  blogRepository;
        }
        @Override
        public Blog saveBlog(Blog blog){
            final Optional<Blog> op= blogRepository.findById(blog.getBlogId());
            if(op.isPresent()){
                throw new BlogAlreadyExistsException();
            }
            return blogRepository.save(blog);
        }
        @Override
        public List<Blog> getAllBlogs() {
        List<Blog>blogs= (List<Blog>) blogRepository.findAll();
        return blogs;
        }
        @Override
        public Blog getBlogById(int id) {
            if(blogRepository.findById(id).isEmpty()){
                throw new BlogNotFoundException();
            }

            return blogRepository.findById(id).get();
        }
        @Override
        public Blog deleteBlog(int id) {
            var blog=blogRepository.findById(id);
            if(blog.isEmpty()){
                throw new BlogNotFoundException();
            }
            var blog1=blogRepository.findById(id);
            blogRepository.deleteById(blog1.get().getBlogId());
            return blog.get();
        }
        @Override
        public Blog updateBlog(Blog blog){
               final var optional =  blogRepository.existsById(blog.getBlogId());
                  if(!optional){
                          throw new BlogNotFoundException();
                   }
        return blogRepository.save(blog);
    }
}


