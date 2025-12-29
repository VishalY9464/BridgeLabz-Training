/*
===========================================================
Problem: 283. Move Zeroes
===========================================================
Given an integer array nums, move all 0's to the end of it
while maintaining the relative order of the non-zero elements.

*/

class Solution {
    public void moveZeroes(int[] nums) {

        int pos = 0;  // Position to place next non-zero element

        // Move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        // Fill remaining positions with zero
        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }
    }
}
