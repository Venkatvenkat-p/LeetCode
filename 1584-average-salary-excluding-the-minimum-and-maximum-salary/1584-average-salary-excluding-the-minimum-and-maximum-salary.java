class Solution {
    public double average(int[] salary) {
        double average;
        double total=0;
        Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++){
            total+=salary[i];
         }
            average=total/(salary.length-2);
            return average;    
     }       
}