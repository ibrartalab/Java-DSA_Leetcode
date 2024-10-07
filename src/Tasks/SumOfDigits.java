package Tasks;

public class SumOfDigits {
    public static void main(String[] args) {
        int result = sumOfDigits(345);
        System.out.println(result);
    }

    //Sum of digits of a given integer
    public static int sumOfDigits(int num){
        int sum = 0;

        while (num > 0){
            int reminder = num % 10;
            num = num / 10;
            sum += reminder;
        }
        return  sum;
    }
}
