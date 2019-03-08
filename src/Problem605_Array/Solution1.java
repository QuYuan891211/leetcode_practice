package Problem605_Array;

/**
 * @Author: QuYuan
 * @Description: 605. Can Place Flowers
Easy

423

244

Favorite

Share
Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: True
Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: False
Note:
The input array won't violate no-adjacent-flowers rule.
The input array size is in the range of [1, 20000].
n is a non-negative integer which won't exceed the input array size.
 * @Date: Created in 15:36 2019/3/8
 * @Modified By:
 */
public class Solution1 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        int indexes = 0;
//        if(flowerbed.length == 1 && flowerbed[0] == 0){indexes++;}
//    if(flowerbed.length>1){
//        if(flowerbed[0] + flowerbed[1] == 0){indexes++;}
//        if(flowerbed[flowerbed.length-2] + flowerbed[flowerbed.length-1] == 0){indexes++;}
//        for(int i=1;i<flowerbed.length -3;i++){
//            if(flowerbed[i]+flowerbed[i+1]+flowerbed[i+2] == 0){
//                indexes++;
//                i+= 1;
//            }
//        }
//    }
//        return n <= indexes?true:false;

        int i = 0;
        int count = 0;
        while (i++<flowerbed.length){
            if(flowerbed[i]==0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)){
                flowerbed[i++] = 1;
                count++;
            }
        }
        return count >= n;
    }
}
