package DSA_Leetcode_Problems;
public class Reverse{
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 55, 6, 7, 8, 9, 10};
    // int n = arr.length;
    // int[] temp = new int[n];
    // for (int i = 0; i < n; i++) {
    //   temp[i] = arr[n - i - 1];
    // }
    // for (int i = 0; i < n; i++) {
    //   arr[i] = temp[i];
    // }
    // for (int i = 0; i < n; i++) {
    //   System.out.print(arr[i] + " ");
    // }

    int start = 0;
    int end = arr.length - 1;
    int[] result = reverseArray(arr, start, end);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }

  public static int[] reverseArray(int[] arr,int start,int end){
    while(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return arr;
  }
}