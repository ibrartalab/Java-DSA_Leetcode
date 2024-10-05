package Basics;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical OR || --> means either one condition true , then it will execute.
        // Logical AND && --> means both  conditions true , then it will execute
        // Logical NOT ! --> neither a single  condition true , then it will execute

        int a = 20;
        int b = 30;

        if(a > 18 || a < 25){
            System.out.println("You are fresh graduate");
        } else if (a > 25 && a == b) {
            System.out.println("May be you have a good job! with minimum of 3-4 years experience");
        } else if (a < 18 && a != b) {
            System.out.println("You are currently studying...");
        }else {
            System.out.println("No data available");
        }

        /*
        Logical OR || :
            true + true = true
            true + false = true
            false + false = false
        Logical AND && :
            true + true = true
            true + false = false
            false + false = false
        */
    }
}
