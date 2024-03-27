class Solution {
    public void moveZeroes(int[] nums) {
 
        
        int writePointer = 0; 

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0)
                nums[writePointer++] = nums[i];
        }

        while(writePointer < nums.length)
            nums[writePointer++] = 0;
    }
}