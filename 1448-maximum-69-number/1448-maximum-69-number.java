class Solution {
    public int maximum69Number (int num) {
        StringBuilder n = new StringBuilder(String.valueOf(num));
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='6'){
                n.setCharAt(i,'9');
                break;
            }
        }
        String x = n.toString();
        return Integer.valueOf(x);

    }
}