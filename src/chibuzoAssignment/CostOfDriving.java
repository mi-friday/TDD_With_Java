package chibuzoAssignment;
import java.util.Scanner;
public class CostOfDriving {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the driving distance: ");
            double distance = input.nextDouble();
            System.out.print("Enter the miles per gallon: ");
            double mpg = input.nextDouble();
            System.out.print("Enter the price per gallon: ");
            double pricePerGallon = input.nextDouble();
            double gallons = distance / mpg;
            double cost = gallons * pricePerGallon;
            System.out.printf("The cost of driving %.1f miles is $%.2f%n", distance, cost);
        }
    }


