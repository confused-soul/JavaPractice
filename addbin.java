class addbin {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }

    public static String addBinary(String a, String b) {
        int x = a.length();
        int y = b.length();
        for(int i = 0; i < Math.abs(x-y); i++){
            if(x > y)
                b = '0'+b;
            else
                a = '0'+a;
        }
        int l = Math.max(x,y);
        String ans = "";
        char c = '0';
        for(int i = 0; i < l; i++){
            char p = a.charAt(l-i-1);
            char q = b.charAt(l-i-1);
            char s = binbitsum(p, q, c);
            c = binbitcarry(p, q, c);
            ans = s + ans;
        }
        ans = c + ans;
        for(int i = 0; i < l+1; i++){
            if(ans.charAt(i) == '1')
                return ans.substring(i);
        }
        return "0";
    }

    public static char binbitsum(char p, char q, char c){
        int count = 0;
        if(p == '1')
            count++;
        if(q == '1')
            count++;
        if(c == '1')
            count++;
        if(count == 0 || count == 2)
            return '0';
        else
            return '1';
    }

    public static char binbitcarry(char p, char q, char c){
        int count = 0;
        if(p == '1')
            count++;
        if(q == '1')
            count++;
        if(c == '1')
            count++;
        if(count > 1)
            return '1';
        else
            return '0';
    }
}