package chibuzoAssignment;
import java.util.Scanner;
public class DoWhileLoop {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            char choice;
            do {
                System.out.print("Enter the first number: ");
                double num1 = input.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = input.nextDouble();

                double sum = num1 + num2;
                System.out.printf("The sum of %.2f and %.2f is %.2f%n", num1, num2, sum);

                System.out.print("Do you want to perform the operation again? (Y/N): ");
                choice = input.next().charAt(0);
            } while (choice == 'Y' || choice == 'y');
        }
    }


