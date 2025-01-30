class Solution {
    public int maxSubArray(int[] nums) {
        // Check if the input array is null or empty, return 0 in that case
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Initialize maxSum to the smallest possible integer value
        // This will store the maximum sum found so far
        int maxSum = Integer.MIN_VALUE;

        // Initialize currentSum to 0
        // This will keep track of the sum of the current subarray we are considering
        int currentSum = 0;

        // Iterate over the elements of the array
        for (int i = 0; i < nums.length; i++) {
            // Update currentSum to be either the current element or the sum of the current element and previous subarray sum
            // We choose the maximum because if the current element itself is larger, it is better to start a new subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maxSum with the larger of the current maxSum and currentSum
            maxSum = Math.max(currentSum, maxSum);
        }

        // Return the largest subarray sum found
        return maxSum;
    }
}
