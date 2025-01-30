class Solution {
    public int[] searchRange(int[] nums, int target) {
        // nums: array of integers sorted in non-decreasing order
        // target: the integer to search for
        // Return: an array of two integers representing the first and last positions
        //         of target in the array, or [-1, -1] if target is not found
        
        int n = nums.length;  // Get the length of the array
        int low = 0;          // Initialize the low index for binary search
        int high = n - 1;     // Initialize the high index for binary search
        
        // Perform binary search to find the target value
        while (low <= high) {
            int middle = (low + high) / 2;  // Find the middle index
            
            if (nums[middle] == target) {
                // If we find the target at the middle, we now find the range
                
                int start = middle;  // Set start as the middle index
                int end = middle;    // Set end as the middle index
                
                // Find the first occurrence of target (move left while still matching)
                while (start > 0 && nums[start - 1] == target) {
                    start--;
                }
                
                // Find the last occurrence of target (move right while still matching)
                while (end < n - 1 && nums[end + 1] == target) {
                    end++;
                }
                
                // Return the range [start, end] where the target is found
                return new int[]{start, end};
            }
            // If target is greater than middle element, search in the right half
            else if (target > nums[middle]) {
                low = middle + 1;
            }
            // If target is smaller than middle element, search in the left half
            else {
                high = middle - 1;
            }
        }
        
        // If the target is not found, return [-1, -1]
        return new int[]{-1, -1};
    }
}

