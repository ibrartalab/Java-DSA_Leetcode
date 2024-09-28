package DSA_Leetcode_Problems;

public class SearchInsert{
    public static void main(String[] args){
        // int[] nums = {1,3,5,6};
        int[] nums = {1};
        int target = 2;
        System.out.println(serachInsertPosition(nums, target));
    }

    public static int serachInsertPosition(int[] arr, int target){
        int isValuePresent = 0;
        // if(target > arr.length){
        //    return  isValuePresent = arr.length;
        // }
        for(int i = 0; i <= arr.length; i++){
            if(i == arr.length){
                isValuePresent = i;
                break;
            }
            if(arr[i] == target){
                isValuePresent = i;
                break;
            }
            if(arr[i] > target){
                isValuePresent = i;
                break;
            }

        }
        return isValuePresent;
    }
}