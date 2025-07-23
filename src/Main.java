import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int arrayLength = scanner.nextInt();

        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];

            if (numbers[i] >= max) {
                max = numbers[i];
            }

            if (numbers[i] <= min) {
                min = numbers[i];
            }
        }

        System.out.println("Average: " + (sum / arrayLength));
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
