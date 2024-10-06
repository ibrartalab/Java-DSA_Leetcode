package Tasks;

import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {
        createForm();
    }

    //Registration form creating
    public static void createForm(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Java Club!");
        System.out.println("Please fill this form");

        //Getting inputs from the user
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter email address: ");
        String emailAddress = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();
        System.out.print("Please confirm your password: ");
        String confirmPassword = input.nextLine();

        //Validate and conform the password
        confirmPasswordCheck(password,confirmPassword);

        System.out.println("\n");

        //Review your form here
        reviewForm(firstName,lastName,emailAddress,password,confirmPassword);
    }

    //Review form
    public static void reviewForm(String firstName,String lastName,String emailAddress,String password,String confirmPassword){
        System.out.println("Welcome to Java Club!");
        System.out.println("Review your,Registration form");
        System.out.println("-------------------------------------------");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email Address: " + emailAddress);
        System.out.print("Password: ");

        //Hashing the password
        int range = 0;
        while (range < password.length()){
            String hashedPassword = password.replace(password,"*");
            System.out.print(hashedPassword);
            range++;
        }
    }

    //Validate the password
    public static void confirmPasswordCheck(String password, String confirmPassword){
        Scanner input = new Scanner(System.in);
        if(!password.equals(confirmPassword)){
            System.out.println("Error! --Password not match!");
            System.out.print("Please confirm the pass again: ");
            confirmPassword = input.nextLine();
        }

    }
}
