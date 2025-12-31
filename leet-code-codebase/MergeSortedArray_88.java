/*
LeetCode 88 - Merge Sorted Array

Problem Statement:
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order.
Merge nums2 into nums1 as one sorted array.

*/

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = new int[m + n];

        for (int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            temp[i + m] = nums2[i];
        }

        Arrays.sort(temp);

        for (int i = 0; i < temp.length; i++) {
            nums1[i] = temp[i];
        }
    }
}
