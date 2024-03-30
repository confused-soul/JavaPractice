package Programs;

import UDClasses.ComplexNumbers;

public class ComplexNumberUse {
    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(1, 4);
        c1.print();
        ComplexNumbers c2 = new ComplexNumbers(3,2);
        c2.print();
        c1.conjugate().print();
        c2.conjugate().print();
        System.out.println(c1.magnitude());
        System.out.println(c2.magnitude());
        System.out.println(c1.argument());
        System.out.println(c2.argument());
        ComplexNumbers c3 = ComplexNumbers.multiply(c1, c1.conjugate());
        ComplexNumbers c4 = ComplexNumbers.multiply(c2, c2.conjugate());
        ComplexNumbers c5 = ComplexNumbers.multiply(c1, c2);
        c5.print();
        c3.print();
        c4.print();
    }
}
