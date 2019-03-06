package Problem561_Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: QuYuan
 * @Description: 561. Array Partition I
Easy

524

1545

Favorite

Share
Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
Note:
n is a positive integer, which is in the range of [1, 10000].
All the integers in the array will be in the range of [-10000, 10000].
 * @Date: Created in 19:59 2019/3/6
 * @Modified By:
 */
public class Solution1 {
    //count sort
    public int arrayPairSum(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        for(int i =0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }

        int n = max-min+1;
        int[] bucket = new int[n];

        for(int i =0;i<nums.length;i++){

            bucket[nums[i]-min]++;
        }
        List<Integer> newList = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            while (bucket[i]-- > 0){
                newList.add(min+i);
            }
        }
        int sum = 0;
        for(int i=0;i<newList.size()-1;i+=2) {
            sum += Math.min(newList.get(i), newList.get(i + 1));
        }
        return sum;
    }
}
