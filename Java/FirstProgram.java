public class FirstProgram {
    public static void main(String[] args) {
        //this is a comment.Its mean this line will not be executed
        System.out.println("Welcome to Java Programming!");
    }
}

/* 
NOTE:
- The class name must match the filename.
- The main method is the entry point of the program.
- The main method must be declared as public, static, and void.
- The main method accepts a single argument: an array of strings.
- The System.out.println() method is used to print a message to the console.
- The semicolon (;) is used to terminate statements in Java.
- The curly braces ({ and }) are used to define a block of code.
- The code inside the main method is executed when the program is run.
- The double slashes (//) are used to add comments to the code.Comments are ignored by the compiler and are used to document the code.

-Converting source code into machine code is a two-step process:
  1. Compilation: The Java compiler converts the source code into bytecode.
  2. Interpretation: The Java Virtual Machine (JVM) interprets the bytecode and executes the program.

  ----> To compile a Java program, you can use the javac command:
    javac FirstProgram.java
    ----> To run a Java program, you can use the java command:
    java FirstProgram
*/