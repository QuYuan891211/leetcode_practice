package Problem268_Array;

/**
 * @Author: QuYuan
 * @Description: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 * @Date: Created in 19:29 2019/2/21
 * @Modified By:
 */
public class Solution1 {
    public static int missingNumber(int[] nums) {
        int num = (nums.length+1)*nums.length/2;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
        }
        return num - sum;
    }
    public static void main(String[] args){
        int[] a = {3,0,2,4,1,6};
        Solution1.missingNumber(a);
    }
}
