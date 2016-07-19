package leetcode;
/**
 *  Valid Anagram
 *  
 *  Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.
 */
import java.util.Arrays;

public class Q242 {
    public boolean isAnagram(String s, String t) {
    	if(s.equals(t)){
    		return true;
    	}
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return new String(ch1).equals(new String(ch2));
    }
}
