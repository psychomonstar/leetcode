package leetcode;
/** Reverse Integer
 * Reverse digits of an integer.
 *
 */
public class Q007 {
    public int reverse(int x) {
        int res = 0;
        boolean isPositive =true;
        if(x<0){
        	x = -x;
        	isPositive = false;
        }
        while(x>0){
        	if (res != 0 && Integer.MAX_VALUE / res < 10){
        		return 0;            
        	}
        	res = res*10 +x%10;
        	x/=10;
        }
        return isPositive?res:-res;
    }
}
