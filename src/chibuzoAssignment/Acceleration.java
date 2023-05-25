package chibuzoAssignment;

import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting velocity (in m/s): ");
        double v0 = scanner.nextDouble();
        System.out.print("Enter the ending velocity (in m/s): ");
        double v1 = scanner.nextDouble();
        System.out.print("Enter the time span (in seconds): ");
        double t = scanner.nextDouble();
        double a = (v1 - v0) / t;
        System.out.printf("The average acceleration is %.2f ", a);

    }
}
