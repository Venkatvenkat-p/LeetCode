class Solution {
    public boolean digitCount(String num) {
        int freq[] = new int[10];
        for(char a : num.toCharArray()){
            freq[a - '0']++;
        }
        for(int i=0;i<num.length();i++){
            if(freq[i] != num.charAt(i) - '0'){
                return false;
            }
        }
        return true;
    }
}