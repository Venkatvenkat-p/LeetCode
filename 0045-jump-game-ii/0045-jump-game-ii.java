class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int ce = 0;
        int f = 0;
        for(int i=0;i<nums.length-1;i++){
            f = Math.max(f,i+nums[i]);
              if(i == ce){
            jump++;
            ce = f;
            }
        }
        return jump;
    }
}