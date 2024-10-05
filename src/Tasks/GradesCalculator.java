package Tasks;

import java.util.Scanner;

public class GradesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total obtained marks out of 500: ");
        int marks = input.nextInt();

        int totalMarks = 500;
        int percentage =  100 * marks / totalMarks;

        if (percentage == 0 || percentage < 0){
            System.out.println("Sorry! You are fail with percentage of: " + percentage);
            return;
        }

        if(percentage > 90){
            System.out.println("You have got a grade A with percentage of: " + percentage);
        } else if (percentage > 75) {
            System.out.println("You have got a grade B with percentage of: " + percentage);
        } else if (percentage > 60) {
            System.out.println("You have got a grade C with percentage of: " + percentage);
        } else if (percentage > 30) {
            System.out.println("You have got a grade D with percentage of: " + percentage);
        } else if (percentage < 30) {
            System.out.println("You have got a grade F with percentage of: " + percentage);
        }
    }
}
