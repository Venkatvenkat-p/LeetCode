class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> index = new ArrayList<>();
        Arrays.sort(nums); 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index.add(i); 
            }
        }
        return index; 
    }
}