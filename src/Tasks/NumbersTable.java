package Tasks;

public class NumbersTable {
    public static void main(String[] args) {
        tablePrinter(5);
    }

    //Multiplication/Numbers Table
    public static void tablePrinter(int num){
        int count = 1;
        System.out.println("Here is the table of " + num);
        while (count <= 10){
            int calculation = count * num;
            System.out.println(count + " X " + num + " = " + calculation);
            count++;
        }
    }
}
