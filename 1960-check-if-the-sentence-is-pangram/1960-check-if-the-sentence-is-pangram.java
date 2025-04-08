class Solution {
    public boolean checkIfPangram(String s) {
        int[] nums = new int[26];
        for(int i=0;i<s.length();i++){
            nums[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                return false;
            }
        }return true;
    }
}