import java.util.Stack;
//LeetCode 2116
class canbevalid {
public static void main(String[] args) {
    System.out.print(canBeValid("())(()(()(())()())(())((())(()())((())))))(((((((())", "1000111101100110110101111001110111011111100001010011"));
}

    public static boolean canBeValid(String s, String locked) {
        if(s.length() % 2 == 1) return false;
        return parent("", s, locked, 0, 0);
    }

    public static boolean parent(String x, String s, String l, int o, int c){
        if(s.length() == 0){
            return valid(x);
        }
        if(c > o) return false;
        s = s + ' ';
        l = l + ' ';
        if(l.charAt(0) == 1){
            if(s.charAt(0) == ')') c++;
            else o++;
            return parent(x + s.charAt(0), s.substring(1).trim(), l.substring(1).trim(), o, c);
        }
        else{
            return parent(x + '(', s.substring(1).trim(), l.substring(1).trim(), o+1, c) || parent(x + ')', s.substring(1).trim(), l.substring(1).trim(), o, c+1);
        }
    }

    public static boolean valid(String s){
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(stack.peek() == '(' && s.charAt(i) == ')'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty())
            return true;
        else 
            return false;
    }
}