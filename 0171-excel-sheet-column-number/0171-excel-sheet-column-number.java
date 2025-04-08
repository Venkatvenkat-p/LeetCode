class Solution {
    public int titleToNumber(String columnTitle) {
         int columnNumber = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int charValue = columnTitle.charAt(i) - 'A' + 1;
            columnNumber = columnNumber * 26 + charValue;
        }
        
        return columnNumber;
    }
}