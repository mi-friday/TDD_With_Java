package chibuzoAssignment;

public class TriangleC {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10 - row; col++) {
                System.out.print(' ');
            }
            for (int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
    }
}
