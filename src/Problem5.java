import java.util.LinkedList;
public class Problem5 {
    public static void main(String[] args) {
        System.out.println("aaaa: " + longestPalindrome("aaaa"));
        System.out.println("aba: " + longestPalindrome("aba"));
        System.out.println("babad: " + longestPalindrome("babad"));
        System.out.println("cbbd: " + longestPalindrome("cbbd"));
        System.out.println("ac: " + longestPalindrome("ac"));
    }


    public static String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        char[] chars = s.toCharArray();
        int j = 1;
        int maxLength = 0;
        LinkedList<Character> temp = new LinkedList<>();
        StringBuilder solution = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if(chars[i] == chars[i-1]) {
                if(maxLength < 2) {
                    solution.append(chars[i - 1]);
                    solution.append(chars[i]);
                    maxLength = 2;
                }
            while(i - j - 1 >= 0 && i + j < chars.length && chars[i + j] == chars[i - j - 1] ) {
                    if(j==1) {
                        temp.addLast(chars[i]);
                        temp.addFirst(chars[i - 1]);
                    }
                    temp.addLast(chars[i+j]);
                    temp.addFirst(chars[i-j-1]);
                    j++;
                }
            }
            if(temp.size() > maxLength) {
                solution.delete(0, solution.length());
                maxLength = temp.size();
                for(Character c : temp) {
                    solution.append(c);
                }
            }
            temp.clear();
            j = 1;
            if(maxLength == s.length())return solution.toString();

            while(i - j >= 0 && i + j < chars.length && chars[i + j] == chars[i - j] ) {
                if(j==1)temp.addLast(chars[i]);
                temp.addLast(chars[i+j]);
                temp.addFirst(chars[i-j]);
                j++;
            }

            if(temp.size() > maxLength) {
                solution.delete(0, solution.length());
                maxLength = temp.size();
                for(Character c : temp) {
                    solution.append(c);
                }
            }
            temp.clear();
            j = 1;
            if(maxLength == s.length())return solution.toString();
        }
        if(maxLength == 0)
            solution.append(chars[0]);
        return solution.toString();
    }
}
