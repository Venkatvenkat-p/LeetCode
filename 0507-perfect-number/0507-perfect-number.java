class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 1) return false;
        int count = 0;
       
       for(int i=1;i<=num/2;i++){
          if(num % i == 0){
             count += i;
          }
        }
       return count == num;
    }
}