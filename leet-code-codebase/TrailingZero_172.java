/*
===========================================================
Problem: 172. Factorial Trailing Zeroes
===========================================================
Given an integer n, return the number of trailing zeroes in n!.


*/

class Solution {

    public int trailingZeroes(int n) {

        int count = 0;

        // Count factors of 5
        while (n > 0) {
            n = n / 5;
            count += n;
        }

        return count;
    }
}
