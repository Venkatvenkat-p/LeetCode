class Solution {
    public char repeatedCharacter(String s) {
      /*  String a = "";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                a += s.charAt(i);
            }
        }return a.charAt(0);*/
          HashSet<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                return c;
            }
            seen.add(c);
        }
        return '\0';
    }
}