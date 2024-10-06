package Basics;

import java.util.Optional;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = input.nextLine();

        //Invoking the greetUser method
        greetUser(userName);

        //Want to update your username
        System.out.println("Want to update your name?\nSelect option-> Yes/No: ");
        String options = input.nextLine();
        //Invoking the updateUserName method
        updateUserName(options);

    }

    //Greet User
    public static void greetUser(String name){
        System.out.println("Good Morning " + name);
    }

    //Update UserName
    public  static void updateUserName(String option){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your new name: ");
        String updatedName = input.nextLine();

        if (option.equals("yes")){

            System.out.println("welcome back! " + updatedName);
        }

    }
}
