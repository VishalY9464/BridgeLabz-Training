/*
LeetCode 349 - Intersection of Two Arrays

Problem Statement:
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element must be unique.

*/

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int n : nums2) {
            set2.add(n);
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int val : set1) {
            if (set2.contains(val)) {
                resultSet.add(val);
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;

        for (int val : resultSet) {
            result[index++] = val;
        }

        return result;
    }
}
