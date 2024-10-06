package Tasks;

public class PyramidPatternWhileLoop {
    public static void main(String[] args) {
        pyramidPattern();
    }

    //Pyramid star pattern using while loop
    public static void pyramidPattern(){
        int rows = 0;

        while (rows < 5){
            System.out.print("*");

            int starWithSpaces = 0;
            while (starWithSpaces < rows){
                System.out.print(" *");
                starWithSpaces++;
            }
            System.out.println(" ");
            rows++;
        }
    }

}
