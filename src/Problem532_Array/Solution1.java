package Problem532_Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: QuYuan
 * @Description: 532. K-diff Pairs in an Array
Easy

327

695

Favorite

Share
Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Example 1:
Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
Example 2:
Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
Example 3:
Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).
Note:
The pairs (i, j) and (j, i) count as the same pair.
The length of the array won't exceed 10,000.
 * @Date: Created in 16:47 2019/3/6
 * @Modified By:
 */
public class Solution1 {
    //brute force
    public static int findPairs(int[] nums, int k) {
        int count = 0;
        int countSame = 0;
        if (nums == null || nums.length < 2){return 0;}

        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }else {
                countSame++;
            }
        }
        if(k==0){return countSame;}
        Object[] newArray = list.toArray();
        for(int i=0;i<newArray.length - 1;i++){
            for(int j=i+1;j<newArray.length;j++){
                if(Math.abs(Integer.parseInt( newArray[i].toString()) - Integer.parseInt((String) newArray[j].toString()))==k){count++;}
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] a = {1,3,1,5,4};
        int aa = Solution1.findPairs(a,0);
    }
}
