package in.stackroute.ust;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.stackroute.ust.shapes.Circle;
import in.stackroute.ust.shapes.Color;
import in.stackroute.ust.shapes.ShapeManager;
import in.stackroute.ust.shapes.Square;

public class Main {
    public static void main(String[] args) {

        try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {

            ShapeManager sm = context.getBean("sm", ShapeManager.class);
            Color color = context.getBean("color", Color.class);
            Color yellowColor = context.getBean("yellowColor", Color.class);
            Color whiteColor = context.getBean("whiteColor", Color.class);
            Square square = context.getBean("square", Square.class);
            Circle circle = context.getBean("circle", Circle.class);

            color.setColor("RED");
            sm.setShape(square);
            sm.setColor(color);
            sm.drawShape();

            color.setColor("BLUE");
            sm.setShape(circle);
            sm.setColor(color);
            sm.drawShape();

            sm.setColor(whiteColor);
            sm.drawShape();

            sm.setColor(yellowColor);
            sm.drawShape();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}