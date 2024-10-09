package Tasks;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean primeNumber = findPrimeNumber(10);
        System.out.println(primeNumber);
    }
    //find the given number is Prime or not
    public static boolean findPrimeNumber(int num){
        int start = 2;

        //Edge case if user enter 2
        if(num == 2){
            return true;
        }

        while (start < num){
            if(num % start == 0){
                return false;
            }
            start++;
        }

        return true;
    }
}
