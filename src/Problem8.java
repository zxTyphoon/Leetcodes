public class Problem8 {
    public static void main(String[] args) {
        System.out.println("s = 42: " + myAtoi("42"));
        System.out.println("s = -042: " + myAtoi(" -042"));
        System.out.println("s = 1337c0d3: " + myAtoi("1337c0d3"));
        System.out.println("s = 0-1: " + myAtoi("0-1"));
        System.out.println("s = 4193 with words: " + myAtoi("4193 with words"));
    }

    public static int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        char[] chars = s.toCharArray();
        boolean negative = chars[0] == '-';
        int start = 0;
        if (negative || chars[0] == '+')
            start = 1;
        double sum = 0;
        int temp;
        boolean leading = true;
        for (int i = start; i < chars.length; i++) {
            temp = chars[i] - '0';
            if (temp < 0 || temp > 9) {
                sum = (sum / Math.pow(10, (chars.length - i)));
                break;
            }
            if (temp == 0 && leading) {
                start++;
                continue;
            } else {
                leading = false;
            }
            sum = (sum + temp * Math.pow(10, (chars.length - i - 1)));
        }
        if (negative) return (int) -sum;
        return (int) sum;
    }
}