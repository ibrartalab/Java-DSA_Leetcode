package Basics;

public class UnaryOperator {
    public static void main(String[] args) {
        //Pre-increment --> Its say that increment the value first and then use
        int num = 5;
        System.out.print("Pre-increment: ");
        System.out.println(++num);

        //Pre-decrement --> Its say that decrement the value first and then use
        int num1 = 5;
        System.out.print("Pre-decrement: ");
        System.out.println(--num1);

        //Post-increment --> Its say that use it first and then increment
        int x = 5;
        System.out.print("Post-increment: ");
        System.out.println(x++);
        System.out.println(x);

        //Post-decrement --> Its say that use it first and then decrement
        int y = 5;
        System.out.print("Post-decrement: ");
        System.out.println(y--);
        System.out.println(y);

        // -y or -x --> converts positive numbers into negative or negative into positive
        int positive = 3;
        int temp = -positive;
        System.out.println("converted to negative" + temp);
        int resetToPositive = -temp;
        System.out.println("Again converted to positive " + resetToPositive);

        /*
        Explain:
        positive = 3
        temp = -positive --> temp = -3
        resetToPositive = -temp -->  temp = -3 + resetToPositive = -3 --> -3 + -3 = 3
        */

    }
}
