class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int arr[]=new int[m];
        int arr1[]=new int[n];
         int count=0;
        for(int i=0;i<indices.length;i++){
            arr[indices[i][0]]++;
            arr1[indices[i][1]]++;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                count+=(arr[i]+arr1[j])%2;
            }
        }return count;
        
    }
}