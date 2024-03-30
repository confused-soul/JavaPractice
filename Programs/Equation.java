package Programs;

import java.util.Scanner;

public class Equation {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        double x = 0;
        double y = 0;
        int p = 0;
        double l1[] = {0, 0, 0};
        double l2[] = {0, 0, 0};
        String num1 = "";
        for(int i = 0; i < s1.length(); i++){
            if(Character.isDigit(s1.charAt(i))){
                while(Character.isDigit(s1.charAt(i))){
                    num1 = num1 + s1.charAt(i);
                    i++;
                    if(i==s1.length())
                        break;
                }
                l1[p] = Integer.parseInt(num1) + 0.0;
                num1 = "";
            }
            if(i==s1.length())
               break;
            if(Character.isLetter(s1.charAt(i)))
                p++;
        }
        p = 0;
        String num2 = "";
        for(int i = 0; i < s2.length(); i++){
            if(Character.isDigit(s2.charAt(i))){
                while(Character.isDigit(s2.charAt(i))){
                    num2 = num2 + s2.charAt(i);
                    i++;
                    if(i==s2.length())
                        break;
                }
                l2[p] = Integer.parseInt(num2) + 0.0;
                num2 = "";
            }
            if(i==s2.length())
               break;
            if(Character.isLetter(s2.charAt(i)))
                p++;
        }
        x =  (l2[2]*l1[1] - l2[1]*l1[2])/(l1[1]*l2[0] - l2[1]*l1[0]);
        y =  l1[2]/l1[1] - (l1[0]*x)/l1[1];
        System.out.println(x + ", "+y);
        sc.close();
    }
}