class Solution {
    public boolean validMountainArray(int[] arr) {
  
        
        if (arr == null || arr.length < 3){
            return false; 
        }
        boolean isincreasing = arr[1] > arr[0]; 
        if (!isincreasing) return false; 
        
        for (int i = 1; i < arr.length; i++){
            if (arr[i] == arr[i-1]) return false; // in case the mountain is not increasing 
            
            if (isincreasing){
                if (arr[i] < arr[i-1]) isincreasing = false; 
            
            } else {
                if (arr[i] > arr[i-1]) return false; 
            }
        }
        
        return !isincreasing; 
    }
}
    
