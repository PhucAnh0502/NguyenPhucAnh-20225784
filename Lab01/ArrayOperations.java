import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        double[] arr = new double[size];

        System.out.println("Enter " + size + " numeric values:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextDouble();
        }

        Arrays.sort(arr);

        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        double average = sum / size;

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        sc.close();
    }
}
