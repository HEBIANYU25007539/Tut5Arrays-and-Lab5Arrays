import java.util.Random;

public class Lab5ArraysQ2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            int value;
            boolean duplicate;
            do {
                value = r.nextInt(21);
                duplicate = false;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == value) {
                        duplicate = true;
                        break;
                    }
                }
            } while (duplicate);

            numbers[i] = value;
        }

        System.out.println("10 non-duplicate random integers (0 - 20):");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
