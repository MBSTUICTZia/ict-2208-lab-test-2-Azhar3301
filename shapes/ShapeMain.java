package shapes;
import java.util.Scanner;
public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        String color = sc.next();
        boolean filled = sc.nextBoolean();
        
        Shape shape = null;
        if (type.equalsIgnoreCase("RECTANGLE")) {
            double width = sc.nextDouble();
            double length = sc.nextDouble();
            shape = new Rectangle(color, filled, width, length);
        } else if (type.equalsIgnoreCase("CIRCLE")) {
            double radius = sc.nextDouble();
            shape = new Circle(color, filled, radius);
        }
        
        if (shape != null) {
            System.out.println(shape);
            System.out.println();
            System.out.println("--- Downcast Check ---");
            if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                System.out.println("Rectangle width=" + r.getWidth() + " length=" + r.getLength());
            } else if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.println("Circle radius=" + c.getRadius());
            }
        }
        sc.close();
    }
}
