package DSA_Leetcode_Problems;
public class Palindrome{
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(123));
    }

    public static boolean isPalindrome(int a){
        if(a < 0){
            return false;
        }
        int temp = a;
        int reverse = 0;

        while(temp != 0){
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp / 10;
        }

        return a == reverse;
    }
}