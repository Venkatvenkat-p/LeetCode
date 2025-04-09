class Solution {
    public int subtractProductAndSum(int n) {
        int mul = 1;
        int sum = 0;
        while(n != 0){
            int temp = n % 10;
             mul = mul * temp;
             sum = sum + temp;
            n = n / 10;
        }
        return mul - sum;
    }
}