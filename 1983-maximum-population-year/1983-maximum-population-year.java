class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] populationChanges = new int[101]; 
        for (int[] log : logs) {
            populationChanges[log[0] - 1950]++; 
            populationChanges[log[1] - 1950]--;
        } 
        int maxPopulation = 0;
        int maxYear = 1950;
        int currentPopulation = 0;
        for (int year = 0; year < 101; year++) {
            currentPopulation += populationChanges[year];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxYear = 1950 + year;
            }
        }

        return maxYear;
    }

}
 
        
    
