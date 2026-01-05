package com.stackandqueue;

import java.util.Stack;

public class StockSpanProblem {

    public static int[] calculateSpan(int[] prices) {

        int n = prices.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>(); // stores indices

        // First day span is always 1
        span[0] = 1;
        stack.push(0);

        // Process remaining days
        for (int i = 1; i < n; i++) {

            // Pop indices while current price is higher or equal
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack empty, price is highest so far
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] result = calculateSpan(prices);

        System.out.print("Stock Spans: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
