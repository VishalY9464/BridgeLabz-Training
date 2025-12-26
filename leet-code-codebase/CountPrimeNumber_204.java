/*
------------------------------------------------------------
LeetCode Problem 204: Count Primes
------------------------------------------------------------

Problem Statement:
Given an integer n, return the number of prime numbers 
that are strictly less than n.

A prime number is a number greater than 1 that has no
positive divisors other than 1 and itself.

Examples:
Input: n = 10
Output: 4
Explanation: Prime numbers less than 10 are 2, 3, 5, 7.

Input: n = 0
Output: 0

Input: n = 1
Output: 0

Constraints:
0 <= n <= 5 * 10^6
------------------------------------------------------------
*/

class Solution {

    public int countPrimes(int n) {

        // If n is less than or equal to 2, no primes exist
        if (n <= 2) return 0;

        // Boolean array to mark prime numbers
        boolean[] isPrime = new boolean[n];

        // Assume all numbers >= 2 are prime initially
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes algorithm
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {

                // Mark all multiples of i as non-prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = fals
