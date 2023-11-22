class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int arrlength = 2*nums.length; 
        int k = 0; 
        for (int i = 0; i < arrlength; i++){
            ans[i] = nums[k];
            k++;
            if (k == nums.length){
                k = 0; 
            }
        }


        return ans; 
    }
}