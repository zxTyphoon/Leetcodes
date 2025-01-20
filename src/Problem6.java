import java.util.Arrays;

public class Problem6 {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        String[] strArray = new String[numRows];
        Arrays.fill(strArray, "");
        String returnStr = "";
        int curRow = 0;
        boolean downDir = false;
        if (numRows <= 1 || numRows >= s.length()) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            strArray[curRow] += s.charAt(i);
            if (curRow == 0 || curRow == numRows - 1) {
                downDir = !downDir;
            }
            curRow += downDir ? 1 : -1;
        }
        for (int i = 0; i < numRows; i++) {
            returnStr += strArray[i];
        }
        return returnStr;
    }
}