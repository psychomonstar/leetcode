package leetcode;
/*
 * Length of Last Word
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word in the string.
   If the last word does not exist, return 0.

	Note: A word is defined as a character sequence consists of non-space characters only.

	For example, 
	Given s = "Hello World",
	return 5.
 */
public class Q058 {
    public int lengthOfLastWord(String s) {
    	String[] str = s.split(" ");
    	if(str.length==0){
    		return 0;
    	}
    	String str2 = str[str.length-1];
    	return str2.length();
    }
}
