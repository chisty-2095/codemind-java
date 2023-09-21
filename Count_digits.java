import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the array length
        int n = scanner.nextInt();
        
        // Read the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Find the maximum number of digits in the array
        int maxDigits = 0;
        for (int num : arr) {
            int numDigits = countDigits(num);
            maxDigits = Math.max(maxDigits, numDigits);
        }
        
        // Count the elements with the maximum number of digits
        int count = 0;
        for (int num : arr) {
            int numDigits = countDigits(num);
            if (numDigits == maxDigits) {
                count++;
            }
        }
         // Display the count
        System.out.println(count);
        
        scanner.close();
    }
    
    // Helper method to count the number of digits in a number
    private static int countDigits(int num) {
        if (num == 0) {
            return 1; // Special case for 0
        }
        
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
