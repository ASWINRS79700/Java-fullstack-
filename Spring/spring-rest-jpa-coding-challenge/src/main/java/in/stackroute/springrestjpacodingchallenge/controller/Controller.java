package in.stackroute.springrestjpacodingchallenge.controller;

import in.stackroute.springrestjpacodingchallenge.domain.Product;
import in.stackroute.springrestjpacodingchallenge.dto.ProductDto;
import in.stackroute.springrestjpacodingchallenge.repository.FeedbackRepository;
import in.stackroute.springrestjpacodingchallenge.repository.ProductRepository;
import in.stackroute.springrestjpacodingchallenge.service.FeedbackServiceImpl;
import in.stackroute.springrestjpacodingchallenge.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value= "/products")
public class Controller {
        @Autowired
        FeedbackRepository feedbackService;
        @Autowired
        ProductRepository productService;
        @GetMapping("")
        public ResponseEntity<List<Product>> allProductInStore(){

                return ResponseEntity.status(HttpStatus.FOUND).body(productService.findAll());
        }
}
