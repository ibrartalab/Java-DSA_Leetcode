package Tasks;

import java.util.Scanner;

public class SumofOddNumbers {
    public static void main(String[] args) {
        oddNumbersSum();
    }

    //Sum of all odd numbers in specified N numbers.
    public static void oddNumbersSum(){

        // Getting input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();

        //Prevent user from typing 0 or negative numbers
        if(num == 0 || num < 0){
            System.out.print("Please enter a number greater than zero: ");
            num = input.nextInt();
        }

        //finding all the odd number and make sum of it.
        int count = 1;
        int sum = 0;
        while (count < num){
            if(count % 2 != 0){
                sum += count;
            }
            count++;
        }
        System.out.println("Sum of all odd numbers is: " + sum);
    }
}
