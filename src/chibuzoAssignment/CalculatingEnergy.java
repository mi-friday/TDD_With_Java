package chibuzoAssignment;
import java.util.Scanner;
public class CalculatingEnergy {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the amount of water in kilograms: ");
            double mass = input.nextDouble();

            System.out.print("Enter the initial temperature in Celsius: ");
            double initialTemp = input.nextDouble();

            System.out.print("Enter the final temperature in Celsius: ");
            double finalTemp = input.nextDouble();

            double energy = mass * (finalTemp - initialTemp) * 4184;

            System.out.printf("The energy needed to heat %.2f kilograms of water from %.2f C to %.2f C is %.2f joules%n",
                    mass, initialTemp, finalTemp, energy);
        }
    }



