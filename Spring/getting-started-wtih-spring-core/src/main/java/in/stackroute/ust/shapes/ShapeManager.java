package in.stackroute.ust.shapes;

public class ShapeManager {

    private Shape shape;
    private Color color;

    public ShapeManager() {
        System.out.println("ShapeManager constructor");
    }

    public ShapeManager(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void drawShape() {
        shape.draw(color);
    }
}
