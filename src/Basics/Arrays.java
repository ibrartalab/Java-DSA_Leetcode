package Basics;

public class Arrays {
    public static void main(String[] args) {
        //First way of Array declaration
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            int number = 10;
            numbers[i] = number + i;
        }

        System.out.println(java.util.Arrays.toString(numbers));

        //Second way of declaration-Array literal
        int[] descNumbers = {9,8,7,6,5,4,3,2,1};
        System.out.println(java.util.Arrays.toString(descNumbers));
    }
}
