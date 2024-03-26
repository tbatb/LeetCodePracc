class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        // in case arr is empty
        if (n == 0){
            return 0;
        }
        // remove duplicates in-place
        int insertIndex = 1;
        for(int i = 1; i < nums.length; i++){
            // We skip to next index if we see a duplicate element
            if(nums[i - 1] != nums[i]) {
                /* Storing the unique element at insertIndex index and incrementing
                   the insertIndex by 1 */
                nums[insertIndex] = nums[i];     
                insertIndex++;
            }
        }
        return insertIndex;
    }
}