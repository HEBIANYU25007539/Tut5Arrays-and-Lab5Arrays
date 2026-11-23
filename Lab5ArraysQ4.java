public class Lab5ArraysQ4 {
    public static void main(String[] args) {
        int[][] original = {
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}
        };

        System.out.println("3 by 3 Matrix");
        printMatrix(original);

        int[][] rotated = new int[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                rotated[r][c] = original[2 - c][r];
            }
        }

        System.out.println("\nAfter rotates 90 degrees clockwise");
        printMatrix(rotated);
    }

    public static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
