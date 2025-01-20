public class Problem13 {

    public static void main(String[] args) {
        System.out.println("III: " + romanToInt("III"));
        System.out.println("LVIII: " + romanToInt("LVIII"));
        System.out.println("MCMXCIV: " + romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        char[] charArray = s.toCharArray();
        int[] numArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            numArray[i] = checkValue(charArray[i]);
        }
        for (int i = 0; i < numArray.length; i++) {
            if (numArray.length == 1) {
                sum = numArray[0];
                break;
            }
            if (i == numArray.length - 1 && numArray[i] <= numArray[i - 1]) {
                sum = sum + numArray[i];
                break;
            } else if (i == numArray.length - 1 && numArray[i] > numArray[i - 1]) {
                break;
            }
            if (numArray[i] < numArray[i + 1]) {
                sum = sum + numArray[i + 1] - numArray[i];
                i++;
            } else {
                sum = sum + numArray[i];
            }
        }
        return sum;
    }

    public static int checkValue(char c) {
        if (c == 'I') {
            return 1;
        } else if (c == 'V') {
            return 5;
        } else if (c == 'X') {
            return 10;
        } else if (c == 'L') {
            return 50;
        } else if (c == 'C') {
            return 100;
        } else if (c == 'D') {
            return 500;
        } else if (c == 'M') {
            return 1000;
        } else {
            return 0;
        }
    }
}