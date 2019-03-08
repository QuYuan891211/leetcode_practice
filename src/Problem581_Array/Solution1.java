package Problem581_Array;

/**
 * @Author: QuYuan
 * @Description: 581. Shortest Unsorted Continuous Subarray
Easy

1272

63

Favorite

Share
Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
Note:
Then length of the input array is in range [1, 10,000].
The input array may contain duplicates, so ascending order here means <=.
 * @Date: Created in 18:25 2019/3/7
 * @Modified By:
 */
public class Solution1 {
    public static int findUnsortedSubarray(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length-1;

        if(nums.length < 2){return 0;}

      outterLoop1:  for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i] > nums[j]){
                    leftIndex = i;
                    break outterLoop1;
                }
                if(i==nums.length-2){return 0;}
            }
        }

        outterLoop2:   for(int i = nums.length-1;i > 0;i--){
            for(int j = i-1; j>=0;j--){
                if(nums[i] < nums[j]){
                    rightIndex = i;
                    break outterLoop2;
                }
            }
        }

        int length = rightIndex-leftIndex+1;

        return length;
    }

    public static void main(String[] af){
        int[] a = {1,2,3,4};
        int t = Solution1.findUnsortedSubarray(a);
    }
}
