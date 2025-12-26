/*
Problem: Reverse Integer
Problem number: 7
Given a signed 32-bit integer x, return x with its digits reversed.

If reversing x causes the value to go outside the signed 32-bit
integer range [-2^31, 2^31 - 1], then return 0.

Note:
- The environment does NOT allow using 64-bit integers.
- Overflow must be handled manually.

Examples:
Input:  123
Output: 321

Input: -123
Output: -321

Input: 120
Output: 21

*/

class Solution {

    public int reverse(int x) {

        // Variable to store reversed number
        int rev = 0;

        // Loop until all digits are processed
        while (x != 0) {

            // Extract last digit
            int digit = x % 10;

            // Check positive overflow
            if (rev > Integer.MAX_VALUE / 10 ||
               (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Check negative overflow
            if (rev < Integer.MIN_VALUE / 10 ||
               (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            // Update reversed number
            rev = rev * 10 + digit;

            // Remove last digit from x
            x /= 10;
        }

        // Return the reversed integer
        return rev;
    }
}
