/*
===========================================================
Problem: Best Time to Buy and Sell Stock
===========================================================
You are given an array prices where prices[i] is the price
of a stock on the ith day.
You want to maximize profit by choosing one day to buy and
a later day to sell.
Return the maximum profit.
If no profit is possible, return 0.

*/

class Solution {
    public int maxProfit(int[] prices) {

        int min = prices[0];  // Minimum buying price
        int max = 0;          // Maximum profit

        for (int i = 1; i < prices.length; i++) {

            // Update minimum price
            if (prices[i] < min) {
                min = prices[i];
            } 
            // Calculate profit
            else {
                max = Math.max(max, prices[i] - min);
            }
        }

        return max;
    }
}
