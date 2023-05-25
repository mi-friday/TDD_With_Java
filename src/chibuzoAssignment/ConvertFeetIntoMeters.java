package chibuzoAssignment;
import java.util.Scanner;
public class ConvertFeetIntoMeters {
       public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a length in feet: ");
            double feet = input.nextDouble();
            double meters = feet * 0.305;
            System.out.printf("%.2f feet is %.2f meters%n", feet, meters);
        }
    }

