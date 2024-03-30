package Programs;

public class BracketChecker {

    static boolean ispar(String x){
        // add your code here
        String s = "";
        if(x.length() < 2)
            return false;
        for(int i = 0; i<x.length(); i++){
            s = s+x.charAt(i);
            if(s.endsWith("()") || s.endsWith("[]") || s.endsWith("{}")){
                s = s.substring(0, s.length()-2);
            }
        }
        if(s.length() == 0)
            return true;
        else
            return false;    
    }

    public static void main(String[] args) {
        ispar("{({[]})}");
    }
}
