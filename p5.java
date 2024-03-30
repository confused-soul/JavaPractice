import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int m = scanner.nextInt(); 
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] minPrefix = new int[n];
        minPrefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            minPrefix[i] = Math.min(minPrefix[i - 1], arr[i]);
        }

        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int query = scanner.nextInt(); 
            ans[i] = minPrefix[query]; 
        }

        for (int i = 0; i < m; i++) {
            System.out.print(ans[i]);
            if (i < m - 1) {
                System.out.print(" ");
            }
        }
    }
}
