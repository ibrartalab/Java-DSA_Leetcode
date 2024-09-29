package DSA.DSA_Leetcode_Problems;
public class TwoSum{
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = twoSum(nums, target);
        System.out.println(result[0]);
    }

    public static int[] twoSum(int[] arr, int target){
        //initialize the result array
        int[] result = new int[2];

        //linear search for finding the two numbers indexes that sum up to the target
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }

            }
            
        }

        return result;
    }
}