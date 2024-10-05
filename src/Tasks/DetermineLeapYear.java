package Tasks;

import java.util.Scanner;

public class DetermineLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Determine a given year is leap or not!");
        System.out.print("Enter year: ");
        int year = input.nextInt();

        //If year number divisible by 4 or 400 and not by 100
        if(year % 400 == 0 ){
            System.out.println("Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a leap year");
        }

        //Enhanced version -- using relation operators
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a leap year");
        }
    }
}
