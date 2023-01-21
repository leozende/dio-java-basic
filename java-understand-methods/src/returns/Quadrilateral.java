package returns;

/**
 * Exercise class 3 about methods.
 */

public class Quadrilateral {
    
    public static double area(double side) {

        return side * side;
    }

    public static double area(double side1, double side2) {

        return side1 * side2;
    }

    public static double area(double majorBase, double minorBase, double height) {

        return ((majorBase * minorBase) * height) / 2;
    }

    public static float area(float diagonal1, float diagonal2) {

        return (diagonal1 * diagonal2) / 2;
    }
}
