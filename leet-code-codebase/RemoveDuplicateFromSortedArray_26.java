/*
===========================================================
Problem: 26. Remove Duplicates from Sorted Array
===========================================================
Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element
appears only once.
The relative order of the elements should be maintained.
Return the number of unique elements (k).

*/

class Solution {
    public int removeDuplicates(int[] nums) {

        // If array is empty, return 0
        if (nums.length == 0)
            return 0;

        // Index to place the next unique element
        int index = 1;

        // Traverse the array
        for (int i = 1; i < nums.length; i++) {

            // If current element is different from previous
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        // 'index' represents number of unique elements
        return index;
    }
}
