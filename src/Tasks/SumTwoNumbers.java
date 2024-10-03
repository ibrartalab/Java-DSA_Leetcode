package Tasks;

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your Personal Command Line Calculator App\n----------------");

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of your numbers is " + sum);
    }
}
