import java.util.*;

class missingBox{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int a = 15;
            for(int i = 1; i<5; i++)
                a = a - sc.nextInt();
            System.out.println(a);    
            t--;
        }
        sc.close();
    }
}