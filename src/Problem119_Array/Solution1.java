package Problem119_Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: QuYuan
 * @Description:Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

Note that the row index starts from 0.
 * @Date: Created in 15:03 2019/2/12
 * @Modified By:
 */
public class Solution1 {
    /**
     * @author: QuYuan
     * @date: 15:05 2019/2/12
     * @param: [rowIndex]
     * @return: java.util.List<java.lang.Integer>
     */
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(rowIndex >= 0 && rowIndex <= 33){
            list.add(new ArrayList<Integer>());
            list.get(0).add(1);
        }

        for(int index = 1; index<=rowIndex;index++){
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            List<Integer> formerLine = list.get(index - 1);
            for(int i = 1;i<index;i++){
                Integer num = formerLine.get(i-1)+formerLine.get(i);
                row.add(num);
            }
            row.add(1);
            list.add(row);
        }
        return list.get(rowIndex);
    }
}
