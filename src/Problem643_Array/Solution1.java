package Problem643_Array;

/**
 * @Author: QuYuan
 * @Description: 643. Maximum Average Subarray I
Easy

425

80

Favorite

Share
Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.

Example 1:

Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75


Note:

1 <= k <= n <= 30,000.
Elements of the given array will be in the range [-10,000, 10,000].
 * @Date: Created in 16:54 2019/3/8
 * @Modified By:
 */
public class Solution1 {
    public double findMaxAverage(int[] nums, int k) {


        double max = -10000;
        for(int i=0;i<nums.length-k+1;i++){
            double sum = 0;
            for(int j =i;j<i+k;j++){
                sum += nums[j];
            }

            max = Math.max(max,sum/k);
        }
        return max;
    }
}
