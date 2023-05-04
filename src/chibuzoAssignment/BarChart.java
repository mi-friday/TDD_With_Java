package chibuzoAssignment;
import java.util.Scanner;
public class BarChart {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int[] numbers = new int[5];

            for (int i = 0; i < numbers.length; i++) {
                System.out.printf("Enter number %d (1-30): ", i + 1);
                numbers[i] = input.nextInt();
            }

            for (int i = 0; i < numbers.length; i++) {
                System.out.printf("%d: ", numbers[i]);

                for (int j = 0; j < numbers[i]; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }


