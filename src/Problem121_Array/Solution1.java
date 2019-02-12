package Problem121_Array;

/**
 * @Author: QuYuan
 * @Description:Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
 * @Date: Created in 15:21 2019/2/12
 * @Modified By:
 */
public class Solution1 {
    public static int maxProfit(int[] prices) {
//        int maxProfit = 0;
//        int maxProfit1 = 0;
//        int maxProfit2 = 0;
//        int maxProfit3 = 0;
//        int minIndex = 0;
//        int maxIndex = 0;
//        if(prices != null && prices.length>0 ) {
//            for (int i = 0; i < prices.length; i++) {
//                if (prices[i] < prices[minIndex]) {
//                    minIndex = i;
//                }
//                if (prices[i] > prices[maxIndex]) {
//                    maxIndex = i;
//                }
//            }
//            if (minIndex > maxIndex) {
//                int tempMaxIndex = minIndex;
//                for(int i=minIndex;i<prices.length;i++){
//                    if (prices[i] > prices[tempMaxIndex]) {
//                        tempMaxIndex = i;
//                    }
//                }
//                maxProfit1 = prices[tempMaxIndex] - prices[minIndex];
//
//                int tempMinIndex = 0;
//                for(int i=0;i<=maxIndex;i++){
//                    if (prices[i] < prices[tempMinIndex]) {
//                        tempMinIndex = i;
//                    }
//                }
//                maxProfit2 = prices[maxIndex] - prices[tempMinIndex];
//
//                tempMaxIndex = maxIndex + 1;
//                tempMinIndex = minIndex - 1;
//                for(int i=tempMaxIndex;i<=tempMinIndex;i++){
//                    if (prices[i] < prices[tempMinIndex]) {
//                        tempMinIndex = i;
//                    }
//                    if(prices[i]>prices[tempMaxIndex]){
//                        tempMaxIndex = i;
//                    }
//                }
//                maxProfit3 = prices[tempMaxIndex] - prices[tempMinIndex];
//
//                maxProfit = Math.max(maxProfit3,Math.max(maxProfit1,maxProfit2));
//            }else {
//                maxProfit = prices[maxIndex] - prices[minIndex];
//            }
//
//        }
//        return maxProfit;

        //Brute force
        int maxProfit = 0;
        int profit = 0;
        for(int i=0;i<prices.length-1;i++){
            for(int j = i+1;j<prices.length;j++){
                profit = prices[j] - prices[i];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] price =
                {7,2,4,1};
        System.out.println(Solution1.maxProfit(price));
    }
}
