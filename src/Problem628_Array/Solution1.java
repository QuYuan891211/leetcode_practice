package Problem628_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: QuYuan
 * @Description: 628. Maximum Product of Three Numbers
Easy

605

245

Favorite

Share
Given an integer array, find three numbers whose product is maximum and output the maximum product.

Example 1:

Input: [1,2,3]
Output: 6


Example 2:

Input: [1,2,3,4]
Output: 24


Note:

The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.

 * @Date: Created in 16:25 2019/3/8
 * @Modified By:
 */
public class Solution1 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
    }
}
