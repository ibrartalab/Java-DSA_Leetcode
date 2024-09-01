package DSA_Leetcode_Problems;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = {9};
        int[] result = plusOne(nums);
        System.out.println("Result: " + Arrays.toString(result));       
    }


    static int[] plusOne(int[] digits){
        int[] temp = digits;
        for (int i = temp.length - 1; i >= 0; i--) {
            if (temp[i] < 9) {
                temp[i]++;
                return temp;
            }
            if(temp[i] == 9){
                temp[i]++;
                if(i == 0){
                    temp = new int[temp.length + 1];
                    temp[0] = 1;
                    for (int j = 1; j < temp.length; j++) {
                        temp[j] = 0;
                    }
                    return temp;
                }
            }
        }
        return  temp;
    }
}
