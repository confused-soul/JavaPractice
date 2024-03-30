package Programs;
//adding two numbers in binary format
import java.util.*;
class binaryaddition{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String u = toBinary(a);
        String v = toBinary(b);
        int l1 = u.length();
        int l2 = v.length();
        int ch = l1 > l2 ? 1 : 2;
        String z = "";
        for(int i = 0; i < Math.abs(l1-l2); i++)
            z = z +"0";
        switch(ch){
            case 1 : v = z + v;
            break;
            case 2 : u = z + u;
        }
        String ans = "";
        int carry = 0;
        for(int i = Math.max(l1,l2)-1; i >= 0; i--){
            char ch1 = u.charAt(i);
            char ch2 = v.charAt(i);
            int d1 = Character.getNumericValue(ch1);
            int d2 = Character.getNumericValue(ch2);
            int x = d1 + d2 + carry;
            String y = toBinary(x);
            char d;
            if(y.length()==2){
                d = y.charAt(1);
                carry = Character.getNumericValue(y.charAt(0));
            }
            else{
                d = y.charAt(0);
                carry = 0;
            }
            ans = d + ans;
        }
        if(carry != 0)
            ans = carry+ans;
        System.out.println(ans);
        sc.close();
    }

    public static String toBinary(int x){
        String bin = "";
        if(x==0){
            return "0";
        }
        for(int i = x; i > 0; i/=2){
            bin = Integer.toString(i%2) + bin;
        }
        return bin;
    }
}
