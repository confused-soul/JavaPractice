/*
Md Yasir Khan
BTech
Jamia Millia Islamia, New Delhi
*/

package Programs;

import java.util.Scanner;

public class DaysCalculator {
    //instance variables - start date & end date
    static int dob ; //ddmmyyyy
    static int today ; //ddmmyyy

    public static boolean checkLeap (int year){
        //checking leap year
        if(year % 400 == 0)
            return true;
        if(year % 4 == 0 && year % 100 != 0)
            return true;
        return false;
    }

    public static void input(){
        //taking inputs
        Scanner sc = new Scanner(System.in);
        dob = sc.nextInt();
        today = sc.nextInt();
        sc.close();
    }

    public static void main(String args[]){
        //getting values
        input();
        int date1 = dob / 1000000;
        int month1 = (dob % 1000000) / 10000;
        int year1 = dob % 10000;
        int yeardiff = 0, daydiff = 0, monthdiff = 0;
        int date2 = today / 1000000;
        int month2 = (today % 1000000) / 10000;
        int year2 = today % 10000;
        //setting days
        int[] days1  = {0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31};
        int[] days2  = {0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31};
        if(checkLeap(year1))
            days1[2] = 29;
        if(checkLeap(year2))
            days2[2] = 29;
        //calculating difference
        yeardiff = year2 - year1;
        int day1 = date1;
        int day2 = date2;
        //number of days past in year
        for(int i = 1; i<=12; i++){
            if(month1>i)
                day1 = day1 + days1[i];
            if(month2>i)
                day2 = day2 + days2[i];
        }
        //difference in days
        if(day1 < day2){
            daydiff = day2 - day1;
        }
        else {
            daydiff = 365 - (day1 - day2);
            yeardiff--;
        }
        monthdiff = daydiff / 30;
        daydiff = daydiff % 30;
        //Printing Age
        System.out.println (yeardiff + " Years, "+ monthdiff + " Months, " + daydiff + " Days");
    }
}