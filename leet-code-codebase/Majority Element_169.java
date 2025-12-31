/*
LeetCode 169 - Majority Element

Problem Statement:
Given an array nums of size n, return the majority element.
The majority element appears more than ⌊n / 2⌋ times.

*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
