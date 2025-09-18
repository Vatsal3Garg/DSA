class Solution {
    public int[] searchRange(int[] nums, int target) {
		
		int a = FirstOccurence( nums ,  target );
		int b = LastOccurence( nums ,  target );
		return new  int[]{a,b};
		
		
	}


	public static int FirstOccurence(int[] arr , int target ) {
		
		int start = 0 ;
		int end = arr.length-1;
		int res1 = -1;
		
		while (start <= end) {
			int mid = start + (end - start)/2;
			if(target == arr[mid]) {
				
				res1 = mid;
				end = mid - 1;
				
			}
			else if(target > arr[mid]) {
				start = mid + 1;
				
			}else if (target < arr[mid]) {
				end = mid - 1;
			}
		}
		
	return res1;
		
		
		
	}
	
	public static int LastOccurence(int[] arr , int target ) {
		
		int start = 0 ;
		int end = arr.length-1;
		int res2 = -1;
		
		while (start <= end) {
			int mid = start + (end - start)/2;
			if(target == arr[mid]) {
				
				res2 = mid;
				start = mid + 1;
				
			}
			else if(target > arr[mid]) {
				start = mid + 1;
				
			}else if (target < arr[mid]) {
				end = mid - 1;
			}
		}
		
	return res2;
		
		
		
	}
	
	
	
}