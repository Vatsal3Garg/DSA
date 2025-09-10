class Solution {
    public int findNumbers(int[] nums) {
        int fin = 0;
        for (int i = 0; i < nums.length;i++){
            int a = nums[i];
            int count = 0;
            
            int b = -1;;
            while ( a != 0){
                b = a % 10 ;
                count++;
                a = a/10;
                
            }
             if (count % 2 == 0){
                fin++;
               
            
             }
        }
        return fin;
    }

}