package UDClasses;

public class ComplexNumbers{
    
    private int real;
    private int imaginary;

    public ComplexNumbers(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal(){
        return real;
    }

    public int getImaginary(){
        return imaginary;
    }

    public void setReal(int real){
        this.real = real;
    }

    public void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }

    public void print(){
        if(real != 0){
            if(imaginary>0)
                System.out.println(real+" + "+Math.abs(imaginary)+"i");
            else if (imaginary<0)
                System.out.println(real+" - "+Math.abs(imaginary)+"i");
            else
                System.out.println(real);
        }
        else 
            System.out.println(imaginary+"i");
    }

    public void add(ComplexNumbers cn){
        this.real = this.real + cn.real;
        this.imaginary = this.imaginary + cn.imaginary;
    }

    public void sub(ComplexNumbers cn){
        this.real = this.real - cn.real;
        this.imaginary = this.imaginary - cn.imaginary;
    }

    public ComplexNumbers conjugate(){
        int newimg = 0 - this.imaginary;
        ComplexNumbers cn = new ComplexNumbers(this.real, newimg);
        return cn;
    }

    public Double magnitude(){
        Double val = Math.sqrt(this.real*this.real + this.imaginary*this.imaginary);
        return val;
    }

    public Double argument(){
        Double arg = Math.atan(imaginary/(real+0.00));
        arg = Math.rint(Math.toDegrees(arg)*100)/100;
        return arg;
    }

    public static ComplexNumbers multiply(ComplexNumbers c1, ComplexNumbers c2){
        int nr = c1.real*c2.real - c1.imaginary*c2.imaginary;
        int ni = c1.real*c2.imaginary + c1.imaginary*c2.real;
        ComplexNumbers cn = new ComplexNumbers(nr, ni);
        return cn;
    }

    public static ComplexNumbers divide(ComplexNumbers c1, ComplexNumbers c2){
        //TODO make real and imaginary as Double everywhere.
        ComplexNumbers num = ComplexNumbers.multiply(c1, c2.conjugate());
        num.print();
        int den = ComplexNumbers.multiply(c2, c2.conjugate()).real;
        System.out.println(den);
        int nr = num.real / den;
        int ni = num.imaginary / den;
        ComplexNumbers cn = new ComplexNumbers(nr, ni);
        return cn; 
    }
}