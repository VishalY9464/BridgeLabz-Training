/*

Problem: Add Digits
Given an integer num, repeatedly add all its digits until the
result has only one digit, and return it.
*/

class Solution {

    // Main method to reduce number to a single digit
    public int addDigits(int num) {

        // Repeat until number becomes a single digit
        while (num >= 10) {
            num = sumOfDigit(num);
        }

        return num;
    }

    // Method to calculate sum of digits
    public static int sumOfDigit(int n) {
        int sum = 0;

        while (n != 0) {
            int rem = n % 10;   // get last digit
            sum += rem;        // add digit to sum
            n = n / 10;        // remove last digit
        }

        return sum;
    }
}
