import java.util.Random;
import java.util.Scanner;

public class Lab5ArraysQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        int[][] hours = new int[n][7];
        int[] total = new int[n];

        for (int emp = 0; emp < n; emp++) {
            for (int day = 0; day < 7; day++) {
                hours[emp][day] = r.nextInt(8) + 1;
                total[emp] += hours[emp][day];
            }
        }

        System.out.println("\nEmployee\tMon Tue Wed Thu Fri Sat Sun\tTotal");
        for (int emp = 0; emp < n; emp++) {
            System.out.print("Emp " + (emp + 1) + "\t");
            for (int day = 0; day < 7; day++) {
                System.out.print(hours[emp][day] + "   ");
            }
            System.out.println("\t" + total[emp] + " hours");
        }

        sc.close();
    }
}
