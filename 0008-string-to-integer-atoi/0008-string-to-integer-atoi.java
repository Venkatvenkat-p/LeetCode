class Solution {
    public int myAtoi(String s) {
         s = s.trim();
      long ans = 0;
      boolean a = false;
      for(int i=0;i<s.length();i++){
        if(i == 0 && s.charAt(i) == '-') a = true;
        else if(i == 0 && s.charAt(i) == '+')continue;
        else if(s.charAt(i) >= '0' && s.charAt(i) <='9') ans = ans * 10 +(s.charAt(i)-'0');
        else break;
        if(a){
            if((ans * -1) <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        else if(ans >Integer.MAX_VALUE) return Integer.MAX_VALUE;
      }
      return (int)(a ? ans * -1:ans);  
    }
}