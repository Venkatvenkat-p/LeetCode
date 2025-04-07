class Solution {
    public String sortSentence(String s) {
        String[] a = s.split(" ");
        String[] res = new String[a.length];
        for(String word : a){
            int pos = word.charAt(word.length() - 1) - '0';
            res[pos - 1] = word.substring(0,word.length()-1);
        }
        return String.join(" ",res);
    }
}