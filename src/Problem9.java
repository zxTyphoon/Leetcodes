public class Problem9 {
    public static void main(String[] args) {
        System.out.println("121: " + isPalindrome(121));
        System.out.println("-121: " + isPalindrome(-121));
        System.out.println("10: " + isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        boolean isPalindrome = true;
        int temp = x;
        int numDigits = 0;
        while (temp > 0) {
            temp = temp / 10;
            numDigits++;
        }
        int[] arr = new int[numDigits];
        temp = x;
        int i = 0;
        while (temp > 0) {
            arr[i] = temp % 10;
            temp = temp / 10;
            i++;
        }
        for (int j = 0; j < arr.length / 2; j++) {
            if (arr[j] != arr[arr.length - 1 - j]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}