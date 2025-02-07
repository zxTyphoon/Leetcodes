public class Problem7 {

    public static void main(String[] args) {
        System.out.println("-2147483412: " + reverse(-2147483412));
        System.out.println("1534236469: " + reverse(1534236469));
        System.out.println("123: " + reverse(123));
        System.out.println("-123: " + reverse(-123));
        System.out.println("120: " + reverse(120));
        System.out.println("7394268: " + reverse(7394268));
    }

    public static int reverse(int x) {
        if (x == 0)
            return 0;
        int[] max = {2, 1, 4, 7, 4, 8, 3, 6, 4, 8};
        boolean negative = false;
        if (x < 0) {
            x = x * -1;
            negative = true;
        }
        while (x % 10 == 0) {
            x /= 10;
        }
        double temp = x;
        int ctr = 0;
        while (temp > 10) {
            temp = temp / 10;
            ctr++;
        }
        int[] arr = new int[ctr + 1];
        boolean maxBool = true;
        int result = 0;
        for (int i = 0; i <= ctr; i++) {
            temp = (double) x / Math.pow(10, i);
            arr[i] = getNumber(temp);
            if (ctr == 9 && maxBool) {
                if (arr[i] > max[i])
                    return 0;
                if (arr[i] < max[i])
                    maxBool = false;
            }
            result += (int) (arr[i] * Math.pow(10, arr.length - i - 1));
        }
        if (negative)
            result = result * -1;
        return result;
    }

    public static int getNumber(double x) {
        while (x >= 10) {
            x -= 10;
        }
        for (int i = 1; i < 10; i++) {
            if (x + i >= 10 && x + i < 11) {
                return 10 - i;
            }
        }
        return 0;
    }
}
