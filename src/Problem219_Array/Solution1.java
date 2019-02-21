package Problem219_Array;

/**
 * @Author: QuYuan
 * @Description: Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 * @Date: Created in 19:14 2019/2/21
 * @Modified By:
 */
public class Solution1 {
    //brute force
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean answer = false;
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1 ;j<nums.length;j++){
                if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                    answer = true;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,1,2,3};
        Solution1.containsNearbyDuplicate(a,2);
    }
}
