/*

Problem: 189. Rotate Array

Given an array, rotate the array to the right by k steps,
where k is non-negative.

*/

class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        // Handle cases where k is greater than array length
        k = k % n;

        int[] temp = new int[n];

        // Step 1: Copy last k elements to the front
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Step 2: Copy remaining elements
        for (int i = k; i < n; i++) {
            temp[i] = nums[i - k];
        }

        // Step 3: Copy temp array back to nums
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
