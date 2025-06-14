class Solution {
    public int maxFreqSum(String s) {
        int[] frq = new int[26];
        for(char ch : s.toCharArray()){
            frq[ch - 'a']++;
        }
        int max = 0, min = 0;
        for(int i=0;i<26;i++){
            char ch = (char) ('a'+ i);
            int count = frq[i];
            if("aeiou".indexOf(ch) != -1){
                max = Math.max(max,count);
            }
            else{
                min = Math.max(min,count);
            }
        }
        return max + min;
    }
}