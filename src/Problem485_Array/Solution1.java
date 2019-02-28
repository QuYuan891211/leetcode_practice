package Problem485_Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: QuYuan
 * @Description: Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
 * @Date: Created in 17:22 2019/2/28
 * @Modified By:
 */
public class Solution1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int consecutive = 0;
        List<Integer> consecutiveList = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                consecutive++;
            }else {
                consecutiveList.add(consecutive);
                consecutive = 0;
            }
        }
        //如果最后一个数组不为0
        if(consecutive != 0){consecutiveList.add(consecutive);}

        int maxConsecutive = consecutiveList.get(0);
        for(Integer i : consecutiveList){
            if(i > maxConsecutive){
                maxConsecutive = i;
            }
        }
        return maxConsecutive;
    }
}
