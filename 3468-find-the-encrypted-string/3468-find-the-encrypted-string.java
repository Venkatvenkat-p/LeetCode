class Solution {
    public String getEncryptedString(String s, int k) {
        int a = s.length();
        String b = s + s;
        return b.substring((k % a),(k % a) + a);
    }
}