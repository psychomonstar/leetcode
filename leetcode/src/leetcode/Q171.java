package leetcode;
/**
 * Excel Sheet Column Number
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 */
public class Q171 {
    public int titleToNumber(String s) {
        char[] chs = s.toCharArray();
        int res = 0;
        int count = 0;
        for (int i = chs.length - 1; i >= 0; i++) {
			int temp = chs[i] - 24;
			res += temp * Math.pow(26, count);
		}
        return res;
    }
}
