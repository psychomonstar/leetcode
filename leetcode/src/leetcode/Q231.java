package leetcode;
/**
 * Power of Two
 *
 *Given an integer, write a function to determine if it is a power of two.
 */
public class Q231 {
	public boolean isPowerOfTwo(int n) {
		while (n>1&&n%2==0) {
			n/=2;
		}
		if(n==1){
			return true;
		}else{
			return false;
		}
	}
}
