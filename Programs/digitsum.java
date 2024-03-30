package Programs;

import java.util.*;
public class digitsum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int a[] = new int[s1];
        while(s1>0){
            a[s1-1] = sc.nextInt();
            s1--;
        }
        int s2 = sc.nextInt();
        int b[] = new int[s2];
        while(s2>0){
            b[s2-1] = sc.nextInt();
            s2--;
        }
        sc.close();
    }
}
