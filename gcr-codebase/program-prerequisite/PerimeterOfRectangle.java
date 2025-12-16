import java.util.Scanner;

public class PerimeterOfRectangle {
    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        double perimeter = calculatePerimeter(length, width);
        System.out.println("Perimeter of Rectangle: " + perimeter);

    }
}
