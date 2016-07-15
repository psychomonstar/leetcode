package leetcode;
/**
 *  Spiral Matrix
 *  
 *  Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,
Given the following matrix:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5]
 */
import java.util.LinkedList;
import java.util.List;

public class Q054 {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new LinkedList<>();
		if(matrix.length == 0){
			return list;
		}
		int startRow = 0, endRow = matrix.length - 1, startCol = 0, endCol = matrix[0].length - 1;
		while (startRow <= endRow && startCol <= endCol) {
			for (int i = startCol; i <= endCol; i++) {
				list.add(matrix[startRow][i]);
			}
			startRow++;
			if(startRow>endRow){
				break;
			}
			for (int i = startRow; i <= endRow ; i++) {
				list.add(matrix[i][endCol]);
			}
			endCol--;
			if(endCol<startCol){
				break;
			}
			for (int i = endCol ; i >= startCol; i--) {
				list.add(matrix[endRow][i]);
			}
			endRow--;
			if(endRow<startRow){
				break;
			}
			for (int i = endRow ; i >= startRow; i--) {
				list.add(matrix[i][startCol]);
			}
			startCol++;
			if(startCol>endCol){
				break;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		new Q054().spiralOrder(new int[][] { {7 }, {9}, { 6}});

	}
}
