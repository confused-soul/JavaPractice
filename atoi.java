public class atoi {
    public static void main(String[] args) {
        atoi ob = new atoi();
        System.out.println(ob.myAtoi("   -42"));
    }
    public int myAtoi(String s) {
        boolean negetive = false;
        boolean numberends = false;
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(i != s.length() - 1 && ch == '-')
                negetive = true;
            if((Character.isLetter(ch) || ((!Character.isDigit(ch)) && ch != ' ' && ch != '-')) && numberends == false)
                return 0;
            if(Character.isDigit(ch)){
                long lnum = (long)num*10 + ((int)ch - 48);
                if(lnum > Math.pow(2, 31) - 1  || (negetive && lnum > Math.pow(2,31))){
                    if(!negetive)
                        return (int)(Math.pow(2, 31) - 1);
                    else
                        return (int)(0 - Math.pow(2,31));
                }
                num = (int)lnum;
                numberends = true;
            }
            else{
                if(numberends){
                    break;
                }
            }
        }
        if(negetive)
            num = 0 - num;
        return num;
    }
}
