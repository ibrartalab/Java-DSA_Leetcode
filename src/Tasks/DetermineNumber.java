package Tasks;

import java.util.Scanner;

public class DetermineNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Checking the number is positive,negative or zero");
        System.out.print("Enter Any number: ");
        int number = input.nextInt();

        if(number > 0){
            System.out.println("Number is Positive!");
        } else if (number == 0) {
            System.out.println("Number is Zero!");
        }else {
            System.out.println("Number is Negative!");
        }
    }
}
