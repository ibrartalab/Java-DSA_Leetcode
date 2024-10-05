package Tasks;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find the greatest number amongst all");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        //find the greatest number
        if(num1 > num2 && num2 > num3){
            System.out.println(num1 + " Is greatest number amongst all");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " Is greatest number amongst all");
        }else {
            System.out.println(num3 + " Is greatest number amongst all");
        }
    }
}
