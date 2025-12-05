class Circle {
    private double radius;

    Circle() {
        radius = 0;
    }

    Circle(double r) {
        radius = r;
    }

    void setRadius(double r) {
        radius = r;
    }

    double getRadius() {
        return radius;
    }
}

class AreaCalculator {
    double calculateArea(Circle c) {
        double r = c.getRadius();
        return 3.1416 * r * r;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5);

        Circle c2 = new Circle(7);

        AreaCalculator ac = new AreaCalculator();

        System.out.println(ac.calculateArea(c1));
        System.out.println(ac.calculateArea(c2));
    }
}
