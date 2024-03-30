/*
Md Yasir Khan
BTech
Jamia Millia Islamia, New Delhi
*/

package Programs;

import java.util.Scanner;
import UDClasses.DynamicArray;

public class useDynamicArray {
    
    public static void main(String args[]){
        DynamicArray a = new DynamicArray();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 12; i++)
            a.add(sc.nextInt()); 
        a.print();
        sc.close();
    }
}
