class Solution {
    public boolean canAliceWin(int[] nums) {
        int onedigit = 0;
        int doubledigit = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 10){
                onedigit += nums[i];
            }
            else if(nums[i] >= 10 && nums[i]<=99){
                doubledigit += nums[i];
            }
        }
        if(onedigit == doubledigit){
            return false;
        }
        return true;
    }
}