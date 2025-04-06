class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int ans = 0,sum = 0;
        while(x>0){
            ans = x%10;
            sum = sum * 10 + ans;
            x = x/10;
            
        }
        if(sum == y){
            return true;
        }
        else{
            return false;
        }
    }
}