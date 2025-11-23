class Solution {
    public int maxSumDivThree(int[] nums) {
       int[] ans = new int[3];
       for(int nn : nums){
          int[] temp = ans.clone();
          for(int i=0;i<3;i++){
            int sum = temp[i] + nn;
            ans[sum % 3] = Math.max(ans[sum % 3],sum);
          }
       } 
       return ans[0];
    }
}