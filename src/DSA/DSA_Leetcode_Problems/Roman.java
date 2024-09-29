package DSA.DSA_Leetcode_Problems;
public class Roman {
    public static void main(String[] args) {
        String romanNumbers = "MCMXCIV";
        int result = romanToInt(romanNumbers);
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        char[] roman = s.toCharArray();
        int result = 0;
        for (int i = 0; i < roman.length; i++) {
            if (i + 1 < roman.length) {
                if (roman[i] == 'I' && roman[i + 1] == 'V') {
                    result += 4;
                    i++;
                    continue;
                } else if (roman[i] == 'I' && roman[i + 1] == 'X') {
                    result += 9;
                    i++;
                    continue;
                } else if (roman[i] == 'X' && roman[i + 1] == 'L') {
                    result += 40;
                    i++;
                    continue;
                } else if (roman[i] == 'X' && roman[i + 1] == 'C') {
                    result += 90;
                    i++;
                    continue;
                } else if (roman[i] == 'C' && roman[i + 1] == 'D') {
                    result += 400;
                    i++;
                    continue;
                } else if (roman[i] == 'C' && roman[i + 1] == 'M') {
                    result += 900;
                    i++;
                    continue;
                }
            }

            switch (roman[i]) {
                case 'I' -> result += 1;
                case 'V' -> result += 5;
                case 'X' -> result += 10;
                case 'L' -> result += 50;
                case 'C' -> result += 100;
                case 'D' -> result += 500;
                case 'M' -> result += 1000;
                default -> {
                }
            }
        }
        return result;
    }
}
