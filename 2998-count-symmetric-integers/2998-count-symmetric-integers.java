class Solution {
    public int countSymmetricIntegers(int low, int high) {
       int count = 0;
       for(int i=low;i<=high;i++){
         String s = Integer.toString(i);
         int a = 0, n = s.length();
         for(int j=0;j<n/2;j++){
            a += s.charAt(j) - s.charAt(n - j - 1);
         }
         if(n % 2 == 0 && a == 0) count ++;
       } 
       return count;
    }
}