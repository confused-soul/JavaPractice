/*
Md Yasir Khan
BTech
Jamia Millia Islamia, New Delhi
*/

import java.util.Scanner;

public class pattern {
    /*
    a
        a
            a
                a
            a
        a
    a
    */ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Odd Number : ");
        int n = sc.nextInt();
        for(int i = 0; i < n ; i++ ){
            int k = i;
            if( i > n/2)
                k = n - i - 1;
            for(int j = 0; j<=k;j++){
                System.out.print("\t");
            }
            System.out.println("a");
        }
        sc.close();
    }
}
//MdYasirKhan