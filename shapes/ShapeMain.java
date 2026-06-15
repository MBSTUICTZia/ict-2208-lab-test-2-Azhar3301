package shapes;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        String color = sc.next();
        boolean filled = sc.nextBoolean();

        Shape shape;

        if (type.equalsIgnoreCase("rectangle")) {

            double width = sc.nextDouble();
            double length = sc.nextDouble();

            shape = new Rectangle(color, filled, width, length);

        } else if (type.equalsIgnoreCase("circle")) {

            double radius = sc.nextDouble();

            shape = new Circle(color, filled, radius);

        } else {
            System.out.println("Invalid shape");
            sc.close();
            return;
        }

        System.out.println(shape);

        sc.close();
    }
}
