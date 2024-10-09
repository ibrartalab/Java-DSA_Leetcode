package Tasks;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacci(15);
    }

    //Fibonacci
    public static void fibonacci(int num){
        int first = 0;
        int second = 1;
        while (second < num){
            int sum = first + second;
            first = second;
            second = sum;
            if (second < num){
                System.out.println(second);
            }

        }
    }
}
