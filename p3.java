import java.util.Scanner;
import java.util.Stack;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] maxDifference = calculateMaxDifference(arr);

        int result = maxDifference[0];
        for (int i = 1; i < n; i++) {
            result = Math.max(result, maxDifference[i]);
        }

        System.out.println(result);
    }

    public static int[] calculateMaxDifference(int[] arr) {
        int n = arr.length;
        int[] maxDiff = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] > stack.peek()) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                maxDiff[i] = stack.peek() - arr[i];
            }

            stack.push(arr[i]);
        }

        return maxDiff;
    }
}
