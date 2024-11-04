
import java.util.Scanner;

public class evenArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Even numbers in the array are:");
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " ");
            }
        }
        
        scanner.close();
    }
}