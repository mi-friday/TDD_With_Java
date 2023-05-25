package chibuzoAssignment;

public class TriangleB {
    public static void main(String[] args) {
        for (int row = 10; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
    }
}
