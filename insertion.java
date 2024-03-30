import java.util.Arrays;
import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[47];
        for(int i = 0; i < 47; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(findTwoElement(a, 47)));
        System.out.println(Arrays.toString(a));
        sc.close();
    }
    public static int[] findTwoElement(int arr[], int n) {
        // code here
        int[] ans = new int[2];
        for (int start = 0; start < n - 1; start++) {
            int item = arr[start];
            int pos = start;

            for (int i = start + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            if (pos == start) {
                continue;
            }

            while (item == arr[pos]) {
                pos++;
            }

            if (pos != start) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

            while (pos != start) {
                pos = start;

                for (int i = start + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                while (item == arr[pos]) {
                    pos++;
                }

                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] != i+1){
                ans[0] = arr[i];
                break;
            }
        }
        for(int i = 0; i < n; i++){
            if(i!=0 && arr[i] - arr[i-1] > 1){
                ans[1] = i;
                break;
            }
        }
        return ans;
        
    }
}