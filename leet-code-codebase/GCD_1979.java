/*
===========================================================
Problem: Find GCD of Smallest and Largest Number in an Array
===========================================================

Given an integer array nums, return the greatest common divisor (GCD)
of the smallest and largest numbers in the array.

The Greatest Common Divisor (GCD) of two numbers is the largest positive
integer that divides both numbers without leaving a remainder.


*/

import java.util.*;

class Solution {

    // Method to find GCD of smallest and largest number
    public int findGCD(int[] nums) {

        // Step 1: Initialize min and max values
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Step 2: Find smallest and largest elements in the array
        for (int num : nums) {
            if (num < min)
                min = num;

            if (num > max)
                max = num;
        }

        // Step 3: Apply Euclidean Algorithm
        // gcd(a, b) = gcd(b, a % b)
        while (min != 0) {
            int remainder = max % min;
            max = min;
            min = remainder;
        }

        // Step 4: Return the GCD
        return max;
    }
}
