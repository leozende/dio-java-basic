package returns;

public class Main {
    public static void main(String[] args) {
        
        // Returns
        System.out.println("Return exercise");

        double squareArea = Quadrilateral.area(3);
        System.out.println("Square area: " + squareArea);

        double rectangleArea = Quadrilateral.area(5D, 5D);
        System.out.println("Rectangle area: " + rectangleArea);

        double triangleArea = Quadrilateral.area(7,8,9);
        System.out.println("Triangle area: " + triangleArea);

        double losangleArea = Quadrilateral.area(5f,5f);
        System.out.println("Losangle area: " + losangleArea);

    }
}
