package DSA;
// Binary Search is a search algorithm that finds the position of a target value within a sorted array.

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {2,4,6,9,11,12,14,20,36,48};
        int target = 48;

        int s = 0;
        int e = sortedArray.length - 1;

        for(int i = s; i < e; i++){
            int mid = (s + e) / 2;

            if(target == sortedArray[mid]){
                // System.out.println("Target found at index: " + mid);
                break;
            }else if(target < sortedArray[mid]){
                e = mid - 1;
            }else if(target > sortedArray[mid]){
                s = mid + 1;
            }

            System.out.println("Target found at index: " + mid);
        }
    }

}
