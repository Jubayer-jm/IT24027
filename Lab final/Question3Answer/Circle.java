package Question3;
public class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14159 * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }
}