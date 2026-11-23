import java.util.Random;
import java.util.Scanner;

public class Lab5ArraysQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
        }

        System.out.println("A list of 20 random integer within 0 to 100");
        printArray(arr);

        for (int pass = 0; pass < arr.length - 1; pass++) {
            for (int i = 0; i < arr.length - 1 - pass; i++) {
                if (arr[i] < arr[i + 1]) {
                    int hold = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = hold;
                }
            }
        }
        System.out.println("\nArray in descending order");
        printArray(arr);

        System.out.print("\nEnter a number to search: ");
        int key = sc.nextInt();

        int linearLoops = 0;
        boolean linearFound = false;
        for (int i = 0; i < arr.length; i++) {
            linearLoops++;
            if (arr[i] == key) {
                linearFound = true;
                break;
            }
        }

        int binaryLoops = 0;
        boolean binaryFound = false;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            binaryLoops++;
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                binaryFound = true;
                break;
            } else if (key > arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println();
        if (linearFound) {
            System.out.println(key + " found");
        } else {
            System.out.println(key + " not found");
        }
        System.out.println("Linear Search - " + linearLoops + " loop(s)");
        System.out.println("Binary Search - " + binaryLoops + " loop(s)");

        sc.close();
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
