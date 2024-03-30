package Programs;
import java.util.Scanner;

public class spiralMat {
    public static void main(String args[]){
        int A[][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i < 3; i++){
            for(int j =0; j < 3; j++){
                A[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
}
