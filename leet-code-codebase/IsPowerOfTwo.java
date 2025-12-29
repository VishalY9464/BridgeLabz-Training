/*
Problem: Power of Two

Given an integer n, return true if it is a power of two.
Otherwise, return false.

An integer n is a power of two if there exists an integer x such that:
n == 2^x
*/

class Solution {

    public boolean isPowerOfTwo(int n) {

        // Check if n is positive and only one bit is set
        return n > 0 && (n & (n - 1)) == 0;
    }
}
