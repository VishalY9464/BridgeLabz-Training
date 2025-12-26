/*
------------------------------------------------------------
LeetCode Problem 1295: Find Numbers with Even Number of Digits
------------------------------------------------------------

Problem Statement:
Given an array nums of integers, return how many of them contain 
an even number of digits.

Examples:
Input: nums = [12, 345, 2, 6, 7896]
Output: 2

Explanation:
12 → 2 digits (even)
345 → 3 digits (odd)
2 → 1 digit (odd)
6 → 1 digit (odd)
7896 → 4 digits (even)

Only 12 and 7896 have an even number of digits.

Constraints:
1 <= nums.length <= 500
1 <= nums[i] <= 10^5
------------------------------------------------------------
*/

class Solution {

    // Main method to count numbers with even number of digits
    public int findNumbers(int[] nums) {

        int countEven = 0;  // Stores count of numbers with even digits

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {

            // Count digits of each number
            int digitCount = countDigits(nums[i]);

            // Check if digit count is even
            if (digitCount % 2 == 0) {
                countEven++;
            }
        }

        return countEven;
    }

    // Method to count number of digits in a number
    public static int countDigits(int num) {

        int count = 0;

        // Count digits using division
        while (num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}
