package Problem66_Array;

import java.util.Arrays;

/**
 * @Author: QuYuan
 * @Description:66. Plus One
Easy

728

1327

Favorite

Share
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 * @Date: Created in 19:25 2019/2/4
 * @Modified By:
 */
public class Solution1 {
    public static int[] plusOne(int[] digits){
        if (digits[digits.length-1] != 9){
                digits[digits.length-1] +=1;
                return digits;
        }
        for(int i = digits.length - 1; i >= 0;i--){
            if (digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i] += 1;
                break;
            }
        }
        if (digits[0] == 0){
            int[] copy = Arrays.copyOf(digits,digits.length + 1);
            for(int i = digits.length - 1;i>=0;i--){
                copy[i + 1] = copy[i];
            }
            copy[0] =1;
            return copy;
        }
        return digits;
    }
}
