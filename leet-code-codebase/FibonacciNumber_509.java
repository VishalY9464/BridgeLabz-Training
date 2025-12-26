/*
------------------------------------------------------------
LeetCode Problem 509: Fibonacci Number
------------------------------------------------------------

Problem Statement:
The Fibonacci numbers form a sequence where:
F(0) = 0
F(1) = 1
F(n) = F(n - 1) + F(n - 2) for n > 1

Given an integer n, return F(n).

Examples:
Input: n = 2
Output: 1

Input: n = 3
Output: 2

Input: n = 4
Output: 3

Constraints:
0 <= n <= 30
------------------------------------------------------------
*/

class Solution {

    public int fib(int n) {

        // Base cases
        if (n == 0 || n == 1) {
            return n;
        }

        // Initialize first two Fibonacci numbers
        int a = 0;   // F(0)
        int b = 1;   // F(1)
        int c = 0;   // To store next Fibonacci number

        // Calculate Fibonacci numbers iteratively
        for (int i = 2; i <= n; i++) {
            c = a + b;  // F(n) = F(n-1) + F(n-2)
            a = b;      // Move forward
            b = c;
        }

        // Return the nth Fibonacci number
        return c;
    }
}
