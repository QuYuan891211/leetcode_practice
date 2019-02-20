package Problem217_Array;

/**
 * @Author: QuYuan
 * @Description: Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
 * @Date: Created in 0:11 2019/2/21
 * @Modified By:
 */
public class Solution1 {
    //brute force
    public boolean containsDuplicate(int[] nums) {
        boolean isDuplicate = false;
        if(nums != null && nums.length >= 2){
            for(int i = 0; i< nums.length -1 ; i++){
                for(int j = i+1; j< nums.length;j++){
                    if(nums[i] == nums[j]){
                        isDuplicate = true;
                    }
                }
            }
        }
        return isDuplicate;
    }
}
