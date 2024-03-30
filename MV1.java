import java.util.*;

public class MV1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNext())
            list.add(sc.nextInt());
        int size = list.size();
        int q = list.get(0);
        for(int i = 0; i < size; i++){
            if(list.get(i) < q)
                q = list.get(i);
        }
        int product = 1;
        int chcf = list.get(0);
        for(int i = 0; i < size; i++){
            if(list.get(i) == q) continue;
            if(hcf(list.get(i), q) != 1){
                System.out.println("None");
                return;
            }
            chcf = hcf(chcf, list.get(i));
            product = product*list.get(i);
        }
        int lcm  = product/chcf;
        int p = lcm + q;
        System.out.println(p);
        sc.close();
    }
    public static int hcf(int a, int b){
        for(int i = (int)Math.min(a, b); i >= 1; i--){
            if(a%i == 0 && b%i == 0)
                return i;
        }
        return 1;
    }
}