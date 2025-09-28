
 
class Solution {



    int findPeak(MountainArray arr) {
		
		int s = 0;
		int e = arr.length() - 1;
		
		while (s <= e) {
			
			int m =  s + (e - s)/2;
			if(arr.get(m) < arr.get(m + 1)) {
				s = m + 1;
			}
			else if(arr.get(m)< arr.get(m - 1) ){
				e = m - 1;
			}
				else {
				return m;
			}
	
		}
		return -1;
	}



 int binarySear(MountainArray arr, int tar , int s , int e) {
	
	
	
	 
	while(s <= e) {
		int m = s + (e - s)/2;
		if(tar < arr.get(m)) {
			e = m - 1;
			
		}else if(tar > arr.get(m)) {
			s = m + 1;
			
		}else if(tar == arr.get(m)) {
			return m ;
		}
	}
	return -1;
}
static int binarySer(MountainArray arr, int tar , int s , int e) {
	
	
	
	 
	while(s <= e) {
		int m = s + (e - s)/2;
		if(tar < arr.get(m)) {
			s = m +1;
			
		}else if(tar > arr.get(m)) {
			e = m -1;
			
		}else if(tar == arr.get(m)) {
			return m ;
		}
	}
	return -1;
}
		
 
    public int findInMountainArray(int target, MountainArray mountainArr) {
        	int c = findPeak(mountainArr);
	int d = mountainArr.length() - 1;
        if  (binarySear(mountainArr, target , 0, c ) >= 0) {
        	return binarySear(mountainArr, target , 0, c );
        	
        }else if(binarySer(mountainArr, target , c, d ) >= 0) {
        	return binarySer(mountainArr, target , c, d );
        }
        else {
        	return -1;
        }


        
    }
}