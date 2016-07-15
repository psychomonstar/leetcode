package leetcode;
/**
 * Add Digits
 *
 *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */
public class Q258 {
    public int addDigits(int num) {
    	int temp = 0;
        while(true){
        	temp+=num %10;
        	num /=10;
        	if(num==0){
        		temp+=num;
        		break;
        	}
        }
        if(temp>=10){
        	return addDigits(temp);
        }else{
        	return temp;
        }
    }
    
}
