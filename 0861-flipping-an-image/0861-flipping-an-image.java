class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
     int [][] ans=new int[image.length] [image[0].length];
        for(int i=0;i<image.length;i++){
            int n=image.length;
            int indx=0;
            for(int j=n-1;j>=0;--j){
              ans[i][indx++]=image[i][j];
            }
        }
        for(int i=0;i<ans.length;i++){
        for(int j=0;j<ans[0].length;j++){
            if(ans[i][j]==0){
                ans[i][j]=1;
            }
            else if(ans[i][j]==1){
                ans[i][j]=0;
            }
        }
           
    }
    return ans;
}
}