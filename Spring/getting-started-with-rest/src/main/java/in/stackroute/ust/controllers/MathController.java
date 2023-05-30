package in.stackroute.ust.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")

public class MathController {
     Num n=new Num();
    @GetMapping("/add/{n1}/{n2}")
    public Num add(@PathVariable int n1,@PathVariable int n2){
        n.num1=n1;
        n.num2=n2;
        n.result=n1+n2;
        n.operation="+";
        return n;

    }
    @GetMapping("/sub/{n1}/{n2}")
    public Num sub(@PathVariable int n1,@PathVariable int n2){
        n.num1=n1;
        n.num2=n2;
        n.result=n1-n2;
        n.operation="-";
        return n;

    }
    @GetMapping("/mul/{n1}/{n2}")
    public Num mul(@PathVariable int n1,@PathVariable int n2){
        n.num1=n1;
        n.num2=n2;
        n.result=n1*n2;
        n.operation="*";
        return n;

    }
    @GetMapping("/div/{n1}/{n2}")
    public Num div(@PathVariable int n1,@PathVariable int n2){
        n.num1=n1;
        n.num2=n2;
        n.result=n1/n2;
        n.operation="/";
        return n;

    }
}
