package Problem283_Array;

/**
 * @Author: QuYuan
 * @Description:
 * @Date: Created in 23:54 2019/2/21
 * @Modified By:
 */
public class Solution1 {
    public static void moveZeroes(int[] nums) {
        for(int i = 0;i<nums.length;i++) {
            if(nums[i] == 0){
                for(int j = i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
                nums[nums.length-1] = 0;
                i--;
            }
            int sum = 0;
            for(int j=i+1;j<nums.length;j++){
                sum +=nums[j];
            }
            if(sum == 0){
                break;
            }
        }
    }
    public static void main(String[] args){
        int[] a = {0,1,0,4,1,6};
        Solution1.moveZeroes(a);
    }
}
