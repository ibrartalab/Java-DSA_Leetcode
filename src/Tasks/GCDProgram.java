package Tasks;

public class GCDProgram {
    public static void main(String[] args) {
        // Greatest common divisor
        int result = gcdCalculator(50,70);
        System.out.println("GCD of given numbers is: " + result);
    }

    //GCD calculator
    public static int gcdCalculator(int a, int b){
        int gcd = 1;
        int i = 2;
        int least = least(a,b);
        while (i <= least){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    //lease number finder
    public  static int least(int a, int b){
        if (a < b){
            return a;
        }else {
            return b;
        }
    }

}
