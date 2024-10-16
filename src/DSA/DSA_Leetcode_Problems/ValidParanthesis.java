package DSA.DSA_Leetcode_Problems;

public class ValidParanthesis {

    public static void main(String[] args) {
        String s = "(){}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s){
       while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                // If the string becomes empty, it indicates all brackets are matched.
                return s.isEmpty();
            }
        }
//        return valid;
    }

}
