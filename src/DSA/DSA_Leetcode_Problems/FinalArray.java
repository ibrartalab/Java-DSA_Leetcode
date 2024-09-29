package DSA.DSA_Leetcode_Problems;

import java.util.Arrays;

public class FinalArray {
    public static void main(String[] args) {
        int[] nums = {2,1,3,5,6};
        int target = 5;
        int operatin  = 2;
        int[] result = minMultiplier(nums, target, operatin);
        System.out.println("Result: " + Arrays.toString(result));

        

    }

    static int[] minMultiplier(int[] nums,int target, int operation){
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int min = nums[i];
            int minIndex = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] < min){
                    min = nums[j] * operation;
                    minIndex = j;
                    System.out.println("Min: " + min + " MinIndex: " + minIndex);
                }
                temp = nums;
            }
           

        }
        return temp;
    }
}
