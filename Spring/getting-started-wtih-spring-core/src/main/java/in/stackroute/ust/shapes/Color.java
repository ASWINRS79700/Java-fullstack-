package in.stackroute.ust.shapes;

public class Color {

    private String color;

    public Color() {
        System.out.println("Color constructor");
    }

    public Color(String color) {
        this.color = color;
        System.out.println("Color constructor with color: " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
