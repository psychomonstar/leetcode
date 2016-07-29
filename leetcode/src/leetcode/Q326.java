package leetcode;

/**
 * Power of Three
 * Given an integer, write a function to determine if it is a power of three.
 */
public class Q326 {
    public boolean isPowerOfThree(int n) {
    	
        return (n>0&&Math.pow(3, 19)%n==0)?true:false;
    }
}
