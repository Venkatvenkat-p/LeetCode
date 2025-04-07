class Solution {
    public int searchInsert(int[] nums, int target) {
             int m = 0, n = nums.length;
        while (m < n) {
            int mid = (m + n) >>> 1;
            if (nums[mid] >= target) {
                n = mid;
            } else {
                m = mid + 1;
            }
        }
        return m;

        
    }
}