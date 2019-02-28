package Problem414_Array;

/**
 * @Author: QuYuan
 * @Description: Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
 * @Date: Created in 15:31 2019/2/28
 * @Modified By:
 */
public class Solution1 {
    //bucket sort
    public static int thirdMax(int[] nums) {
//        if(nums.length < 2 ){
//            return nums[0];
//        }
//        int max = nums[0];
//        int min = nums[0];
//        for(int i:nums){
//            if(i>max){
//        max = i;
//    }
//            if(i<min){
//        min = i;
//    }
//}
//
//    int n = max - min + 1;
//    int[] bucket = new int[n];
//        for(int i = 0;i<nums.length;i++){
//        bucket[nums[i]-min]++;
//        }
//        int rank = 0;
//        int maxElement = 0;
//        for(int i = n-1;i>=0;i--){
//        if (bucket[i] == 0){continue;}
//        if(++rank == 1){maxElement = i+1;}
//        if(rank == 3){return i+1;}
//        }
//        return maxElement;
        if(nums.length < 2 ){
            return nums[0];
        }
        int firstMax=nums[0];

        int min = nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstMax){
                firstMax = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }
        int secondMax = min;
        int thirdMax = min;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==firstMax){
                nums[i] = min;
            }
            if(nums[i]>secondMax){
                secondMax = nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==secondMax){
                nums[i] = min;
            }
            if(nums[i]>thirdMax){
                thirdMax = nums[i];
            }
        }
        if(thirdMax == secondMax){return firstMax;}
        return thirdMax;
    }

    public static void main(String[] args){
        int[] a = {3,2,1};
        int b =Solution1.thirdMax(a);
        System.out.println(b);
    }
}