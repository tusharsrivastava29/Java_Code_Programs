class Solution {
    public int[] searchRange(int[] nums, int target) {
        // array of integers nums sorted in non-decreasing order
        // target, [-1,-1]
        // O(log n)
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int middle = (low+high)/2;
            if(nums[middle] == target){
                int start=middle, end = middle;
                while(start>0 && nums[start-1]==target ){
                    start--;
                }
                while(end<n-1 && nums[end+1]==target ){
                    end++;
                }
                
                return new int[]{start, end};
            }
            else if(target>nums[middle]){
                low = middle+1;
            }
            else{
                high=middle-1;
            }
        }

        return new int[]{-1,-1};
    }
}
