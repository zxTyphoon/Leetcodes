import java.util.HashMap;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println("test 1: " + lengthOfLongestSubstring("abcabcbb"));
        System.out.println("test 2: " + lengthOfLongestSubstring("dvdf"));
        System.out.println("test 3: " + lengthOfLongestSubstring("pwwkew"));
        System.out.println("test 4: " + lengthOfLongestSubstring(""));
        System.out.println("test 4: " + lengthOfLongestSubstring("a"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();
        char[] letters = s.toCharArray();
        int temp = 0;
        int max = 0;
        int o = 0;
        for (char letter : letters) {
            chars.replace(letter, 2);
            while (chars.containsValue(2)) {
                if (chars.get(letters[o]) == 2) {
                    chars.replace(letters[o], 1);
                } else {
                    chars.remove(letters[o]);
                }
                o++;
                if (temp > 0) temp--;
            }
            chars.putIfAbsent(letter, 1);
            temp++;
            if (temp > max) max = temp;
        }
        return max;
    }

}
