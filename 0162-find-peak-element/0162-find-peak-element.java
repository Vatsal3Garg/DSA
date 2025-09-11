class Solution {
    public int findPeakElement(int[] arr) {
        for(int i = 0 ; i< arr.length;i++){

    if(i == arr.length-1){
        return i;
    }else

    if (arr[i] > arr[i+1])
        return i;
    }
    return -1;
    }
}