class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int n=0;
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            if(n<sum){
              n=sum;
            }


        }  return n;
        
    }
}