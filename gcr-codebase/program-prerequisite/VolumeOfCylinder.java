import java.util.Scanner;

public class VolumeOfCylinder {

    public static double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double volume = calculateVolume(radius, height);
        System.out.println("Volume of Cylinder: " + volume);

        
    }
}
