class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int ab=nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<ab;j++){
                if(nums[i]==nums[j]){
                    count=count+1;
                }
            }
        }
        return count;
        
    }
}