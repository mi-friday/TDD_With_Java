package chibuzoAssignment;

public class TriangleA {
    public static void main(String[] args) {
        // pattern 1
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println(); // separate patterns
    }
}