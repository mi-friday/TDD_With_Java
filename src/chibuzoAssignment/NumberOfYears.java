package chibuzoAssignment;
import java.util.Scanner;
public class NumberOfYears {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of minutes: ");
            long minutes = input.nextLong();
            long minutesPerYear = 365 * 24 * 60;
            long minutesPerDay = 24 * 60;
            long years = minutes / minutesPerYear;
            long days = (minutes % minutesPerYear) / minutesPerDay;

            System.out.printf("%d minutes is approximately %d years and %d days%n", minutes, years, days);
        }
    }

