package Basics;

public class WhileLoop {
    public static void main(String[] args) {
        //Initialization
        int count = 1;

        while (count < 10){ // Condition
            //Actual work
            int cart = 200 * count;
            System.out.println(cart);
            count++; //Updating state
        }
    }

    /*
    we need to remember three things use loops in programming in general.
    1: Initialization of the state variable
    2: Specifying the condition , on which the loop will execute
    3: Updating the state variable
     */
}
