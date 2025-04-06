class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans=new int[nums.length];
        if(nums.length==1){
            return nums;
        }
        for(int i=1;i<=nums.length-1;i++)
        {
            ans[0]=nums[0];
            ans[i]=ans[i-1]+nums[i];
        }
       return ans;  
    }
   
}