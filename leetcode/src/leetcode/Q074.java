package leetcode;
/**Search a 2D Matrix
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 *
 */
public class Q074 {
	public static void main(String[] args) {
		new Q074().searchMatrix(new int[][]{{1,4,5,7},{10,11,16,20},{23,30,34,50}}, 3);
	}
	
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
        	if(target>matrix[i][matrix[i].length-1]){
        		continue;
        	}else{
        		for (int j = 0; j < matrix[i].length; j++) {
					if(matrix[i][j]==target){
						System.out.println(true);
						return true;
					}
				}
        	}
		}
        System.out.println(false);
        return false;
    }
}
