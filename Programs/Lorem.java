package Programs;
import java.util.*;

class lorem{
    int n;
    String p = "";

    void input() {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            int i;
            for(i = 0; i < str.length(); i++){
                if(Character.isDigit(str.charAt(i)))
                    break;
            }
            n = Integer.parseInt(str.substring(i));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println(n);
    }

    static String randomWord(){
        int l = (int)(Math.random()*6)+1;
        String s = "";
        for(int i = 0; i < l; i++)
            s = s + (char)(97 + (int)(Math.random()*25));
        return s;
    }

    void paraGenerate(){
        for(int i = 0; i < n; i++)
            p = p + randomWord() + " ";
        System.out.println(p);
    }

    public static void main(String args[]){
        lorem lr = new lorem();
        lr.input();
        lr.paraGenerate();

    }
}