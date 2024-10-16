package Tasks;

public class ArmstrongNumber {
    public static void main(String[] args) {

        boolean result = isArmstrong(8208);
        System.out.println(result);

    }

    //Armstrong Number finding
    public static boolean isArmstrong(int num){
        boolean isArmstrong = false;
        int sum = 0;
        int temp = num;
        while (temp > 0){
            int reminder = temp % 10;
            int digitsCount = getDigits(num);
            int pow = power(reminder,digitsCount);
            temp /= 10;
            sum += pow;
        }
        if (sum == num){
            isArmstrong = true;

        }
        return isArmstrong;
    }

    //Get digits of a number
    public static int getDigits(int num){
        int digitsCount = 0;
        int temp = num;

        while (temp > 0){
            if(temp % 10 == 0 || temp % 10 != 0){
                digitsCount += 1;
                temp /= 10;
            }

        }
        return digitsCount;
    }

    //Get power calculate
    public static int power(int num, int pow){
        int i = 1;
        int sum = 1;
        while (i <= pow){
            sum  = num * sum;
            i++;
        }
        return sum;
    }
}
