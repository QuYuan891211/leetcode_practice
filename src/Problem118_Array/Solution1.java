package Problem118_Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: QuYuan
 * @Description:
 * @Date: Created in 22:15 2019/2/5
 * @Modified By:
 */
//LinkedList is faster than the ArrayList when add or remove an element
public class Solution1 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> collection = new ArrayList<List<Integer>>();
        if(numRows > 0) {
            collection.add(new ArrayList<Integer>());
            collection.get(0).add(1);
        }
         for (int lineNo = 1; lineNo < numRows; lineNo++) {
             List<Integer> line = new ArrayList<Integer>();
             line.add(1);
             List<Integer> formerLine = collection.get(lineNo - 1);
             for (int i = 1; i < lineNo; i++) {
                    line.add(formerLine.get(i-1) + formerLine.get(i));
                }
             line.add(1);
             collection.add(line);
            }
        return collection;
    }
    public static void main(String[] args){
        Solution1.generate(3);
    }
}

