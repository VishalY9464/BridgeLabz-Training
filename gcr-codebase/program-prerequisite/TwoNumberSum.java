import java.util.*;

public class TwoNumberSum {

    public static double sumOfTwoNumber(double num1, double num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter Second Number:");
        double num2 = sc.nextDouble();
        System.out.println("Sum = " + sumOfTwoNumber(num1, num2));
    }
}
