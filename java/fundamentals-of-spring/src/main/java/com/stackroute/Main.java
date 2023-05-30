package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Actor actor=context.getBean("actor",Actor.class);
        System.out.println(actor.toString());
        Movie mv=context.getBean("movie", Movie.class);
        System.out.println(mv.toString());
    }
}