class Solution {
    public String maximumOddBinaryNumber(String s) {
        int zcount = 0;
        int ocount = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                ocount++;
            }
            else{
                zcount++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ocount-1;i++){
            sb.append('1');
        }
          for(int i=0;i<zcount;i++){
            sb.append('0');
        }
        sb.append("1");
        return sb.toString();
    }
}