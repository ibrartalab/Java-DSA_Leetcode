package Basics;

public class ControlFlow {
    public static void main(String[] args) {
        boolean isMorning = false;
        boolean isAfterNoon = true;

        //If it's a day print good morning
        if(isMorning) System.out.println("Good Morning!");

        //If it's a day print good morning, otherwise print good night
        if (isMorning){
            System.out.println("Good Morning!");
        }else{
            System.out.println("Good Night!");
        }

        //If it's not either morning or night , then print Good After Noon
        if(isMorning){
            System.out.println("Good Morning!");
        } else if (isAfterNoon) {
            System.out.println("Good After Noon!");
        }else {
            System.out.println("Good Night!");
        }

    }
}
