import java.util.Scanner;

public class frogjump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] river = new int[8];
        for(int i = 0; i < 8; i++)
            river[i] = sc.nextInt();
        frogjump fj = new frogjump();
        System.out.println(fj.canCross(river));
        sc.close();
    }
    public boolean canCross(int[] stones) {
        int k = Math.abs(stones[0] - 1);
        int p = 0;
        while(p < stones.length){
            int n = -1;
            for(int i = p + 1; i < stones.length; i++){
                if(Math.abs(stones[i] - stones[p]) > k + 1){
                    n = i - 1;
                    break;
                }
            }
            if(n == -1)
                return true;
            if(n == p)
                return false;
            else{
                k = stones[n] - stones[p];
                p = n;
            }
            if( p == stones.length - 1)
                return true;
        }
        return false;
    }
}
