package DSA_Leetcode_Problems;

public class FindIndex {
    // Find the index of the first occurrence an a string
    public static void main(String[] args) {
        String str = "leetcode";
        String target = "code";
        System.out.println(findIndexOfTarget(str, target));
    }

    public static int findIndexOfTarget(String str, String target){
        if(str.contains(target)){
            return str.indexOf(target);
        }else{
            return -1;
        }
    }

}
