class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0; 
        int accountmax = 0; 
        for (int i = 0; i < accounts.length; i++){
            for (int j = 0; j < accounts[i].length; j++){
                System.out.print(accounts[i][j] + " ");
                sum += accounts[i][j];
 
            }
            if (sum > accountmax){
                accountmax = sum; 
            }            
            sum = 0; 
            System.out.println();
        }
        
        return accountmax; 
    }
}
