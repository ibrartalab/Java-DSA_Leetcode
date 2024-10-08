package Tasks;

public class LCMProgram {
    public static void main(String[] args) {
        //Find the Least Common Multiple (LCM) of two numbers
        int lcm = lcmCalculator(10,5);
        System.out.println("LCM of the given numbers is: " + lcm);
    }

    //LCM Calculator
    public static int lcmCalculator(int a, int b){
        int i = 1;
        while (true){
            int factor = a * i;
            if (factor % b == 0){
                return factor;
            }
            i++;
        }
    }
}
