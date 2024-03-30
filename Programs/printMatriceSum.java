package Programs;

import java.util.Scanner;

public class printMatriceSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                b[i][j] = sc.nextInt();
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int i = 0 ; i < n; i ++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j]+"\t");
            }
            if(i==n/2)
                System.out.print("+\t");
            else
                System.out.print(" \t");
            for(int j = 0; j < n; j++){
                System.out.print(b[i][j]+"\t");
            }
            if(i==n/2)
                System.out.print("=\t");
            else
                System.out.print(" \t");
            for(int j = 0; j < n; j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
