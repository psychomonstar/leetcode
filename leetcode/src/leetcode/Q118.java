package leetcode;
/**
 * Pascal's Triangle
 * 
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
import java.util.ArrayList;
import java.util.List;

public class Q118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> lists = new ArrayList<>();
		if (numRows == 0) {
			return lists;
		}
		for (int i = 0; i < numRows; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					list.add(1);
				} else if (i >= 2 && j > 0) {
					list.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
				}
			}
			lists.add(list);
		}
		return lists;
	}
}
