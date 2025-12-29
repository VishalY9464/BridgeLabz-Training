/*

Problem: Power of Three
Given an integer n, return true if it is a power of three.
Otherwise, return false.

An integer n is a power of three if there exists an integer x
such that:
    n == 3^x
*/

class Solution {

    public boolean isPowerOfThree(int n) {

        // Check if n is positive and divides the maximum power of 3
        return n > 0 && 1162261467 % n == 0;
    }
}
