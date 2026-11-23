import java.util.Scanner;

public class Lab5ArraysQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int n = sc.nextInt();

        int[][] triangle = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    triangle[row][col] = 1;
                } else {
                    triangle[row][col] = triangle[row - 1][col - 1]
                                       + triangle[row - 1][col];
                }
            }
        }

        System.out.println("The Pascal Triangle with " + n + " row(s)");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(triangle[row][col] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
