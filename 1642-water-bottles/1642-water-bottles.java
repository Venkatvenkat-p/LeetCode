class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a = numBottles;
        int b = numBottles;
        while(b >= numExchange){
            int c = b / numExchange;
            a += c;
            b = b % numExchange + c;
        }
        return a; 
    }
}