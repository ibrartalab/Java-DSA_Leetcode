package Tasks;

public class Pyramid {
    public static void main(String[] args) {
        int n = 10;

        rightHalf(n);
        System.out.println("---------");
        leftHalf(n);
        System.out.println("---------");
        reverseRightHalf(n);
    }

    // Right half pyramid pattern
    public  static void rightHalf(int n){
        for(int star = 1; star <= n; star++){
            System.out.println("*".repeat(star));
        }
    }

    // Left half pyramid pattern
    public  static void leftHalf(int n){
        for(int star = 1; star <= n; star++){
            int count = n - (star);
            System.out.println(" ".repeat(count) + "*".repeat(star));
        }
    }

    //Reverse right half pyramid pattern
    public static void reverseRightHalf(int n){
        int count = n;
        for(int star = 1; star <= n; star++){
            System.out.println("*".repeat(count));
            count--;
        }
    }
}

/*
Q:Print different shapes of pyramid pattern?
Right half:
*
**
***
****
*****
Left half:
    *
   **
  ***
 ****
*****
Reverse right half:
*****
****
***
**
*

*/
