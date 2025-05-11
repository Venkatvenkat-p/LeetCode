class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
                for (; k>0; k--) {
            var min = Integer.MAX_VALUE;
            for (var i=0; i<nums.length; i++) {
                min = Math.min(min, nums[i]);
            }
            for (var i=0; i<nums.length; i++) {
                if (nums[i] == min) {
                    nums[i] *= multiplier;
                    break;
                }
            }
        }
        return nums;

    }
}