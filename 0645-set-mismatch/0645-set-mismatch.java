class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2]; 
        int[] count = new int[nums.length + 1];
    
        for (int num : nums) {
            count[num]++;
        }  
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 2) {
                ans[0] = i; 
            } else if (count[i] == 0) {
                ans[1] = i; 
            }
        }
        return ans;
    }
}
        
    
