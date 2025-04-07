class Solution {
    public int[] sumZero(int n) {
                int[] sumArr = new int[n];
        int num = 1;
        for(int i=0; i<n; i++){
            if(n%2==1 && i==n-1){
                sumArr[n-1] = 0;
                break;
            }
            sumArr[i++] = -1*(num);
            sumArr[i] = num++;
        }
        return sumArr;
    }
}
        
    