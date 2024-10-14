package Tasks;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(101);
        System.out.println(palindrome);
    }

    //finding a number is palindrome or not
    public static boolean isPalindrome(int num){
        int reversed = reverseNumber(num);

        return num == reversed;
    }

    //reverse a given number
    public static int reverseNumber(int num){
        int newNum = 0;
        while (num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }

        return newNum;
    }
}
