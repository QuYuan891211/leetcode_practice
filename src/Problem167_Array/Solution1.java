package Problem167_Array;

/**
 * @Author: QuYuan
 * @Description:Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 * @Date: Created in 14:08 2019/2/14
 * @Modified By:
 */
//brute force
public class Solution1 {
    public int[] twoSum(int[] numbers,int target){
        int index1 = 0;
        int index2 = 0;
        int[] indics = new int[2];
        if (numbers != null && numbers.length >= 2){
            for(int i = 0; i<numbers.length-1;i++){
                for(int j = i+1;j<numbers.length;j++){
                    if(numbers[i]+numbers[j]==target){
                        index1 = i+1;
                        index2 = j+1;
                    }
                }
            }
            indics[0] = index1;
            indics[1] = index2;
        }
        return indics;
    }

}
