import java.util.Scanner;

class checkMagicMatrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][3];
        int s = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; i<3; i++){
                mat[i][j] = sc.nextInt();
                s = s + mat[i][j];
            }
        }
        s = s / 3;
        int c1 = 0, c2 = 0, c3 = 0, r1 = 0, r2 = 0, r3 = 0, d1 = 0, d2 = 0;
        for(int i = 0; i < 3; i++){
            c1 = c1 + mat[i][0];
            c2 = c2 + mat[i][1];
            c3 = c3 + mat[i][2];
            r1 = r1 + mat[0][i];
            r2 = r2 + mat[1][i];
            r3 = r3 + mat[2][i];
            d1 = d1 + mat[i][i];
            d2 = d2 + mat[i][2-i];
        }
        boolean t1 = c1 == s;
        boolean t2 = c2 == s;
        boolean t3 = c3 == s;
        boolean t4 = r1 == s;
        boolean t5 = r2 == s;
        boolean t6 = r3 == s;
        boolean t7 = d1 == s;
        boolean t8 = d2 == s;
        boolean t9 = t1 && t2 && t3 && t4 && t5 && t6 && t7 && t8;
        if(t9)
            System.out.println("Magic");
        else
            System.out.println("Not Magic");
        sc.close();
    }
}