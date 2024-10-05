package Basics;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 12;
        int b = 4;

        //Bitwise AND &
        int result = a & b;
        System.out.println(result);

        //Bitwise OR |
        int result1 = a | b;
        System.out.println(result1);

        //Bitwise NOT/Compliment ~
        int result2 = ~a;
        System.out.println(result2);

        //Bitwise XOR ^
        int result4 = a ^ b;
        System.out.println(result4);

        //Bitwise LeftShift <<
        int result5 = a << 2;
        System.out.println(result5);

        //Bitwise RightShift >>
        int result6 = b >> 2;
        System.out.println(result6);

        /*
        12 = 1100 binary representation
        4 = 0100 binary representation

        Bitwise & :
            1100 compare 0100 = 0100 -> 4
            if both operands same then convert into 1 otherwise 0
        Bitwise | :
            1100 compare 0100 = 1100 -> 12
            if any of the operands equal 1 then keep it otherwise convert into 0
        Bitwise NOT/Compliment ~:
            1100 converts 0 into 1 and 1 into 0 = 0011 -> -13
            Its work opposite convert 1 into 0 and 0 into 1
        Bitwise XOR ^ :
            1100 compare 0100 = 1000 -> 8
            If both operands are same convert it into 0 like(0,0 = 0 or 1,1 = 0) otherwise 1
        Bitwise LeftShift << :
            1100 << 1 = 0110 -> 24
            Its basically doing multiplication by 10^2, it means multiply each time by 2
        Bitwise RightShift >> :
            1100 >> 1 = 0110 -> 6
            It works opposite the LeftShift instead of multiply its doing division by 2

        */

    }
}
