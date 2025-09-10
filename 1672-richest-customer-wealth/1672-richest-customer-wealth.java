class Solution {
     public static int maximumWealth(int[][] accounts) {
	       int dep = 0;
	        for (int row = 0 ; row < accounts.length; row++){
	            int sum = 0;
	            for(int c = 0; c < accounts[row].length; c++){
	                sum = sum + accounts[row][c];
	                
	            }
	            
	            if (sum > dep) {
	            	dep = sum;
	            	
	            }
	            
	        }
	        return dep;
	    }
}