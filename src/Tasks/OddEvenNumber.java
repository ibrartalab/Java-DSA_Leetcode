package Tasks;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.println("Number is Even!");
        }else {
            System.out.println("Number is Odd!");
        }
    }
}
