public class reversenum {
    public static void main(String[] args) {
        System.out.println(reverse(1001));
    }

    public static int reverse(int n){
        if(n % 10 == n)
            return n;
        return (int)Math.pow(10, (int)(Math.log10(n)))*(n%10) + reverse(n/10); // (int)(Math.log10(n))) ---> (digits in n -1) 
    }
}
