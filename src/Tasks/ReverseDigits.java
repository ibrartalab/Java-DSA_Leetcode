package Tasks;

public class ReverseDigits {
    public static void main(String[] args) {

        int result =  reversingDigits(234);
        System.out.println(result);
    }

    //reverse the digits of a given number; like -> 234 into 432
    public static int reversingDigits(int num){
        int swapedNumber = 0;

        while (num > 0){
            int lastDigit = num % 10;
            swapedNumber = swapedNumber * 10 + lastDigit;
            num = num / 10;
        }
        return  swapedNumber;

    }
}
