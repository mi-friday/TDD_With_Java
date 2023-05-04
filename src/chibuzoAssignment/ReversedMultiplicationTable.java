package chibuzoAssignment;

public class ReversedMultiplicationTable {
        public static void main(String[] args) {
            for (int i = 10; i >= 1; i--) {
                for (int j = 10; j >= 1; j--) {
                    System.out.printf("%d x %d = %d%n", i, j, i * j);
                }
            }
        }
    }


