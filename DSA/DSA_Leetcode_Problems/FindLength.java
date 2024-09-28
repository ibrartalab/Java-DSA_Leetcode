package DSA_Leetcode_Problems;

public class FindLength{
    public static void main(String[] args){
        String s1 = "Hello World";
        System.out.println("Length of the last word in a given string is:" + " " + lastWordLength(s1));
    }
    // finding the length of the last word in a string
    static int lastWordLength(String str){
        int lengthCount = 0;
        String[] Words = str.split(" ");
        for(String word: Words){
            String lastWord = Words[Words.length - 1];
            lengthCount = lastWord.length();
        }
        return lengthCount;
    }
}