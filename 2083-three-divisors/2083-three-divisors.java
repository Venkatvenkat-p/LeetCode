class Solution {
    public boolean isThree(int n) {
        int count = 1;
        for(int i=2;i<n+1;i++){
            if(n % i == 0) count++;
        }
        if(count == 3){
            return true;
        }
        return false;
    }
}