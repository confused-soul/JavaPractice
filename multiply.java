public class multiply {
    public static void main(String[] args) {
        System.out.println(multiplyStrings("35","2"));
    }
    public static String multiplyStrings(String s1,String s2)
    {
        //code here.
        int num1 = intValue(s1);
        int num2 = intValue(s2);
        return stringValue(num1*num2);
        
    }
    public static int intValue(String s){
        int l = s.length();
        int num = 0;
        int i = 0;
        while(i < l){
            int d = s.charAt(i) - 48;
            num = num*10 + d;
            i++;
        }
        return num;
    }
    public static String stringValue(int n){
        StringBuilder num = new StringBuilder();
        while(n>0){
            num.append("" + n%10);
            n = n/10;
        }
        return num.reverse().toString();
    }
}
