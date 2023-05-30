package in.stackroute.ust.shapes;

public class ShapeFX {

    public static void fxShape() {

        ShapeManager sm = new ShapeManager();

        sm.setShape(new Square());
        sm.setColor(new Color("RED"));
        sm.drawShape();

        sm.setShape(new Circle());
        sm.setColor(new Color("BLUE"));
        sm.drawShape();
    }
}

