import java.util.Arrays;
import java.util.Scanner;

public class p4 {
    public static int computeValue(String s) {
        int value = 0;
        boolean hasDigit = false;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                value = value * 10 + (c - '0');
                hasDigit = true;
            }
        }

        if (!hasDigit) {
            value = s.length();
        }

        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String[] arr = scanner.nextLine().split(" ");

        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = computeValue(arr[i]);
        }

        Arrays.sort(values);
        
        // Calculate the maximum product of the two largest values
        long maxProduct = (long) values[n - 1] * (long) values[n - 2];

        System.out.println(maxProduct);
    }
}
