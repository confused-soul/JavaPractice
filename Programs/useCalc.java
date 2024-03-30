package Programs;

import java.util.Scanner;
import UDClasses.Calculator;

public class useCalc {

    public static void main(String args[]) {

        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        String in = "";
        do{
            in = sc.next();
            int f = 1;
            for(int i = 0; i < in.length(); i++){
                if(calc.gettAns()!=0 || !Character.isDigit(in.charAt(i)))
                    f = f * 0;
            }
            if(f == 1){
                int num = Integer.parseInt(in);
                calc.setAns(num);
                System.out.println("Ans : " + calc.gettAns());
            }
            
            if(!Character.isDigit(in.charAt(0))){
                if(!in.equalsIgnoreCase("cc")){
                    int num = Integer.parseInt(in.substring(1));
                    switch(in.charAt(0)){
                        case '+':{
                            calc.add(num);
                            System.out.println("Ans : " + calc.gettAns());
                        }break;
                        case '-':{
                            calc.subt(num);
                            System.out.println("Ans : " + calc.gettAns());
                        }break;
                        case '*':{
                            calc.mul(num);
                            System.out.println("Ans : " + calc.gettAns());
                        }break;
                        case '/':{
                            calc.div(num);
                            System.out.println("Ans : " + calc.gettAns());
                        }break;
                        default : System.out.println("Wrong Format");
                    }
                }
            }
            else if(Character.isDigit(in.charAt(0))){
                int x = 0;
                for(int i = 0; i < in.length(); i++){
                    if(!Character.isDigit(in.charAt(i)))
                        x++;
                }
                if(x==2){
                    int a = Integer.parseInt(in.substring(0, in.indexOf('+')));
                    int b = Integer.parseInt(in.substring(in.indexOf('+') + 1, in.lastIndexOf('+')));
                    int c = Integer.parseInt(in.substring(in.lastIndexOf('+') + 1));
                    calc.add(a, b, c);
                    System.out.println("Ans : " + calc.gettAns());
                }
                else if(x==1){
                    int p = 0;
                    for(int i = 0; i < in.length(); i++){
                        if(!Character.isDigit(in.charAt(i))){
                            p = i;
                        }
                    }
                    int a = Integer.parseInt(in.substring(0, p));
                    int b = Integer.parseInt(in.substring(p + 1));
                    switch(in.charAt(p)){
                        case '+':{
                            calc.add(a, b);
                            System.out.println("Ans : " + calc.gettAns());
                        }break;
                        case '-':{
                            calc.subt(a, b);
                            System.out.println("Ans : " + calc.gettAns());
                        }break;
                        case '*':{
                            calc.mul(a, b);
                            System.out.println("Ans : " + calc.gettAns());
                        }break;
                        case '/':{
                            calc.div(a, b);
                            System.out.println("Ans : " + calc.gettAns());
                        }break;
                        default : System.out.println("Wrong Format");
                    }
                }
            }
        }while(!in.equalsIgnoreCase("cc"));
        sc.close();
    }
}