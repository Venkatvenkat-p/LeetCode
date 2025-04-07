class Solution {
    public int findLucky(int[] arr) {
       int[] count = new int[501];   
           for (int num : arr) {
            count[num]++;  
           }
        int largestLucky = -1; 
        for (int i = 1; i < count.length; i++) {
            if (count[i] == i) {  
                largestLucky = i;  
            }
        }
        return largestLucky;
        
    }
}