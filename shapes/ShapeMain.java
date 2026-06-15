package shapes;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        String color = sc.next();
        boolean filled = sc.nextBoolean();

        if (type.equalsIgnoreCase("rectangle")) {

            double width = sc.nextDouble();
            double length = sc.nextDouble();

            Rectangle r = new Rectangle(color, filled, width, length);

            System.out.println(r);

        } else if (type.equalsIgnoreCase("circle")) {

            double radius = sc.nextDouble();

            Circle c = new Circle(color, filled, radius);

            System.out.println(c);
        }

        sc.close();
    }
}
