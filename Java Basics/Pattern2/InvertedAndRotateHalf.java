public class InvertedAndRotateHalf {
    public static void RoatateHalfPyramid(int n) { // n is a totalRows
        // outer loop
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RoatateHalfPyramid(4);
    }
}
