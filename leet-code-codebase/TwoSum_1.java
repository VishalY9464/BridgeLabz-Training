/*
===========================================================
Problem: Two Sum
===========================================================
Given an array of integers nums and an integer target,
return the indices of the two numbers such that they add
up to the target.
*/

import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        // HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {

            // Find the required complement
            int complement = target - nums[i];

            // If complement exists in map, solution found
            if (map.containsKey(complement)) {
                return new int[]{ map.get(complement), i };
            }

            // Store current number with its index
            map.put(nums[i], i);
        }

        // As per problem statement, this line will never be reached
        return new int[]{};
    }
}
