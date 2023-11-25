class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0; 
        //String workedhours = "There are " + counter + " employees who met the target.";
        for (int i = 0; i < hours.length; i++){
            if (hours[i] >= target){
                counter++;
            }
        }
        return counter; 
    }
}