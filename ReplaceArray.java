
package Array;
import java.util.Scanner;
public class ReplaceArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get array size from user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        // Get array elements from user
        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        // Get old and new values from user
        System.out.print("Enter the value to replace: ");
        int oldValue = scanner.nextInt();
        System.out.print("Enter the new value: ");
        int newValue = scanner.nextInt();
        // Replace manually
        for (int i = 0; i < size; i++) {
            if (arr[i] == oldValue) {
                arr[i] = newValue;
            }}
        // Output the modified array
        System.out.println("Updated array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}