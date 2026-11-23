import java.util.Random;
import java.util.Scanner;

public class Lab5ArraysQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            scores[i] = r.nextInt(101);
            total += scores[i];
        }

        System.out.println("\nA list of scores:");
        for (int i = 0; i < n; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        int highest = scores[0];
        int lowest = scores[0];
        for (int i = 1; i < n; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        double average = (double) total / n;
        System.out.println("\nHighest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.printf("Average score: %.2f%n", average);

        sc.close();
    }
}
