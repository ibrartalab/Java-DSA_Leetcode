package Tasks;

import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Determine the given number is Odd or Even using Bitwise");
        System.out.print("Please enter any number: ");
        int number = input.nextInt();

        if((number & 1) == 1){
            System.out.println("The number is Odd " + number);
        }else{
            System.out.println("The number is Even " + number);
        }
    }
}
