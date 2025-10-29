class Solution {
    public int smallestNumber(int n) {
        for (int i = 0; i <= n; i++) {
            int a = 1 << i;
            if (a > n) return 
           
            a - 1;
        }
        return 0;
    }
}