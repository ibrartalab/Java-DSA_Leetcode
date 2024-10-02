package Tasks;

import java.util.Scanner;

public class GetUsername {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = input.nextLine();
        System.out.println("Welcome " + userName + " to the ultimate Java Learning!");
    }
}
