import java.util.ArrayList;

public class validbrackets {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
            if (list.size() > 1) {
                if (list.get(list.size() - 1) == ')' && list.get(list.size() - 2) == '(') {
                    list.remove(list.size() - 1);
                    list.remove(list.size() - 1);
                }
                else if (list.get(list.size() - 1) == '}' && list.get(list.size() - 2) == '{') {
                    list.remove(list.size() - 1);
                    list.remove(list.size() - 1);
                }
                else if (list.get(list.size() - 1) == ']' && list.get(list.size() - 2) == '[') {
                    list.remove(list.size() - 1);
                    list.remove(list.size() - 1);
                }
            }
        }
        if (list.size() == 0) {
            return true;
        }
        return false;
    }
}
