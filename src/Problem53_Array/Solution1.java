package Problem53_Array;

/**
 * @Author: QuYuan
 * @Description:53. Maximum Subarray
Easy

3508

124

Favorite

Share
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 * @Date: Created in 18:54 2019/2/4
 * @Modified By:
 */
public class Solution1 {
    public static int maxsubArray(int[] nums){
        int lowerIndex = 0;
        for(int i = 0; i<nums.length;i++){
            if (nums[i] >= 0){lowerIndex = i; break;}
        }
        return 0;
    }

}
