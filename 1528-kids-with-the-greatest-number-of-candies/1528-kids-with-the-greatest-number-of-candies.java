class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max=max(candies);
        for(int i=0;i<candies.length;i++){
                if(candies[i]+extraCandies>=max){
                    ans.add(i,true);
                }else if(candies[i] + extraCandies < max){
                        ans.add(i,false);
                    }

                }
                return ans;
              }

    static int max(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}