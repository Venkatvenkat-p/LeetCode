class Solution {
    public int getLeastFrequentDigit(int n) {
    List<Integer>a=new ArrayList<>();

        while(n!=0){
        int d=n%10;
        a.add(d);
        n/=10;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int result =-1;
        int min=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()<min){
                min = entry.getValue();
                result=entry.getKey();
            }
        }
        return result;
    }
}