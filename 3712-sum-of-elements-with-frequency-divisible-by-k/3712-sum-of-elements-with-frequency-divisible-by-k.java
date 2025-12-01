class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
        map.put(n,map.getOrDefault(n,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
          if(entry.getValue()%k==0){
             sum+=entry.getKey()*entry.getValue();
          }
        }
        return sum;
    }
}