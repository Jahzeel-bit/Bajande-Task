package Tasks;
import java.util.Scanner;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
abstract class AbstractShape implements Shape {
    protected String color;

    public AbstractShape(String color) {this.color = color;}
    public String getColor() {return color;}
}
class Circle extends AbstractShape {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Circle [Color=" + color + ", Radius=" + radius + "]";
    }
}
class Rectangle extends AbstractShape {
    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    public String toString() {
        return "Rectangle [Color=" + color + ", Length=" + length + ", Width=" + width + "]";
    }
}
public class Task15 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter circle color: ");
        String cColor = sc.nextLine();
        System.out.print("Enter circle radius: ");
        Circle circle = new Circle(cColor, sc.nextDouble());

        sc.nextLine(); // consume newline
        System.out.print("Enter rectangle color: ");
        String rColor = sc.nextLine();
        System.out.print("Enter rectangle length: ");
        double length = sc.nextDouble();
        System.out.print("Enter rectangle width: ");
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(rColor, length, width);

        System.out.println("\n--- Shape Details ---");
        System.out.println(circle);
        System.out.printf("Area: %.2f, Perimeter: %.2f\n", circle.calculateArea(),
                            circle.calculatePerimeter());
        System.out.println(rectangle);
        System.out.printf("Area: %.2f, Perimeter: %.2f\n", rectangle.calculateArea(),
                            rectangle.calculatePerimeter());
        sc.close();
    }
}
