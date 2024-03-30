package UDClasses;

public class Calculator {
    
    private double ans = 0;

    public void setAns(double a){
        ans = a;
    }
    public double gettAns(){
        return ans;
    }

    public void add(double a){
        ans = ans + a;
    }
    public void add(double a, double b){
        ans = a+b;
    }
    public void add(double a, double b, double c){
        ans = a+b+c;
    }
    public void subt(double a){
        ans = ans - a;
    }
    public void subt(double a, double b){
        ans = a-b;
    }
    public void mul(double a){
        ans = ans*a;
    }
    public void mul(double a, double b){
        ans = a*b;
    }
    public void div(double a){
        ans = ans/a;
    }
    public void div(double a, double b){
        ans = a/b;
    }
    public void mod(double a, double b){
        ans = a%b;
    }
    
}
