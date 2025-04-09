class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean in = true;
        boolean de = true;
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                in = false;
            }
            if (nums[i] < nums[i + 1]) {
                de = false;
            }
        }
         return in || de;
    }
}