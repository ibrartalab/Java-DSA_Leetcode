package Tasks;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        //Getting input from the user and displaying the result
        Scanner input  = new Scanner(System.in);
        System.out.print("Please enter any number: ");
        int num = input.nextInt();

        //call the factorialNumber method and pass a number as a parameter
        int factorial = factorialNumber(num);
        System.out.println("Factorial of " + num + " is " + factorial);
    }

    //Finding the factorial number of a given number
    public static int factorialNumber(int num){
        //initial states
        int count  = 1;
        int sum = 1;

        while (count <= num){
            sum *= count ;
            count++;
        }

        return sum;
    }
}
