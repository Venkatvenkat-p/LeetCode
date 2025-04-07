class Solution {
    public String[] findRelativeRanks(int[] score) {
         int n = score.length;
        String[] result = new String[n];
        int[] sortedScores = Arrays.copyOf(score, n);
        Arrays.sort(sortedScores);
        HashMap<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int rank = n - i;   
            if (rank == 1) {
                rankMap.put(sortedScores[i], "Gold Medal");
            } else if (rank == 2) {
                rankMap.put(sortedScores[i], "Silver Medal");
            } else if (rank == 3) {
                rankMap.put(sortedScores[i], "Bronze Medal");
            } else {
                rankMap.put(sortedScores[i], String.valueOf(rank));
            }
        }
        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(score[i]);
        }
        return result;    
    }
}