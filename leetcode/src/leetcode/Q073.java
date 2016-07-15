package leetcode;
/**
 * Set Matrix Zeroes
 * 
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 */
import java.util.HashSet;

public class Q073 {
	public void setZeroes(int[][] matrix) {
		HashSet<Integer> rows = new HashSet<>();
		HashSet<Integer> cols = new HashSet<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (rows.contains(i) || cols.contains(j)) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		new Q073().setZeroes(new int[][] { { 0 }, { 1 } });
	}
}
