package leetcode;
/**
 * Power of Four
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 */
public class Q342 {
    public boolean isPowerOfFour(int num) {
        int number = 4;
        int count = 0;
        while((int)Math.pow(number,count)<num){
            count++;
        }
        if(Math.pow(number,count)==num){
            return true;
        }else{
            return false;
        }
    }
}
