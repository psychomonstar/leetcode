package leetcode;
/**
 * Pascal's Triangle II
 * 
 * Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].
 */
import java.util.ArrayList;
import java.util.List;

public class Q119 {
    public List<Integer> getRow(int rowIndex) {
    	List<List<Integer>> lists = new ArrayList<>();
		for (int i = 0; i <= rowIndex; i++) {
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
		return lists.get(rowIndex);
    }
    
}
