package Problem163_Array;

/**
 * @Author: QuYuan
 * @Description: Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
 * @Date: Created in 22:10 2019/2/20
 * @Modified By:
 */
public class Solution1 {
    public static int majorityElement(int[] nums) {
        if(nums.length < 2){
            return nums[0];
        }
        int var = 0;
        for(int i=0;i<nums.length -1 ; i++){
            int num = 1;
            for(int j = i+1; j<nums.length;j++){
                if(nums[i] == nums[j]){
                    num++;
                }
            }
            if(num > nums.length/2){
                var = nums[i];
                break;
            }

        }
        return var;
    }
}
