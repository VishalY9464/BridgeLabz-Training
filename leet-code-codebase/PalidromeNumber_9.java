/*
------------------------------------------------------------
LeetCode Problem 9: Palindrome Number
------------------------------------------------------------

Problem Statement:
Given an integer x, return true if x is a palindrome, and false otherwise.

A palindrome number reads the same backward as forward.

Examples:
Input: 121
Output: true
Explanation: 121 reads the same from left to right and right to left.

Input: -121
Output: false
Explanation: From left to right it reads -121, from right to left it becomes 121-.

Input: 10
Output: false
Explanation: Reads 01 from right to left, which is not equal to 10.

Constraints:
-2^31 <= x <= 2^31 - 1
------------------------------------------------------------
*/

class Solution {

    public boolean isPalindrome(int x) {

        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Store original value for comparison
        int temp = x;

        // Variable to store reversed number
        int rev = 0;

        // Reverse the number
        while (x != 0) {
            int digit = x % 10;      // Get last digit
            rev = rev * 10 + digit; // Build reversed number
            x /= 10;                // Remove last digit
        }

        // Check if original number equals reversed number
        return temp == rev;
    }
}
