package in.stackroute.ust.shapes;

public class Square implements Shape {

   // private Color color = new Color("RED"); // tightly coupled
    public Square() {
        System.out.println("Square constructor");
    }
    @Override
    public void area() {
        System.out.println("Area of Square");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Draw Square with color: " + color);
    }
}
