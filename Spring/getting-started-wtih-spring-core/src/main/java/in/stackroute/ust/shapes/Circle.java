package in.stackroute.ust.shapes;

public class Circle implements Shape{

    public Circle() {
        System.out.println("Circle Constructor");
    }

    @Override
    public void area() {
        System.out.println("Area of Circle");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Draw Circle with color: " + color);
    }
}
