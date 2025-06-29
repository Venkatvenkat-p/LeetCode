class Solution {
    public int minimumChairs(String s) {
       int count = 0;
       int max = 0;
       for(char ch : s.toCharArray()){
          if(ch == 'E'){
            count ++;
          } 
          else if(ch == 'L'){
             count --;
          }
         max = Math.max(max , count);
       }
        return max;
    }
}