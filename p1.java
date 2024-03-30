import java.util.*;
import java.io.*;
// Written by Md Yasir Khan {Comment}
class p1{
    // print first 10 even numbers
    public static void main(String args[]){
        // while loop
        int num = 2;
        while(num <= 20){
            System.out.println(num); 
            num = num + 2;
        }

        //do while loop
        num = 2;
        do{
            System.out.println(num); 
            num = num + 2;
        }while(num <= 20);


        // for loop
        for(num = 2; num <= 20; num = num + 2){
            System.out.println(num);
        }
    }
}