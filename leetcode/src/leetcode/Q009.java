package leetcode;
/**
 * Palindrome Number
 *Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Q009 {
    public boolean isPalindrome(int x) {
        String str = new String(""+x);
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(str);
        System.out.println(sb);
        if(str.equals(sb.toString())){
        	return true;
        }else{
        	return false;
        }
    }
    public static void main(String[] args) {
		System.out.println(new Q009().isPalindrome(121));
	}
}
