package overload;

/**
 * Exercise class 2 about methods.
 */

public class Quadrilateral {
    
    public static void area(double side) {

        System.out.println("Square area: " + side * side);
    }

    public static void area(double side1, double side2) {

        System.out.println("Rectangle area: " + side1 * side2);
    }

    public static void area(double majorBase, double minorBase, double height) {

        System.out.println("Triangle area: " + ((majorBase * minorBase) * height) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Losangle area: " + (diagonal1 * diagonal2) / 2);
    }
}
