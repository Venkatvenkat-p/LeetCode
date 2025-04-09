class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s = text.split(" "); // typo: "spilt" -> "split"
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            boolean check = true;
            for (int j = 0; j < brokenLetters.length(); j++) {
                if (s[i].contains(String.valueOf(brokenLetters.charAt(j)))) { // typo: "vlaueOf" -> "valueOf"
                    check = false;
                    break;
                }
            }
            if (check)
                count++;
        }
        return count;
    }
}