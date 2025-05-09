class Solution {
    public int buyChoco(int[] prices, int money) {
       int minsum = Integer.MAX_VALUE;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                int sum = prices[i] + prices[j];
                if(sum <= money){
                    minsum = Math.min(minsum , sum);
                }
            }
        }
        if(minsum == Integer.MAX_VALUE){
            return money;
        }
        return money - minsum;
    }
}