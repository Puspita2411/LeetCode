class Solution {
    public int findPeakElement(int[] arr) {
        int start  = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in the decresing part of array
                //this may be the ans, but look at left
                // this is why end != mid-1;
                end = mid;
            }
            else{
                //you are in ascending part of the array
                // cause we know that mid+1 > mid
                start = mid + 1;
            }
        }
        // In the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to  find the max element in the above 2 checks
        // Hence when they are pointing to just one element that is the max one because that is what the checks say
        // at every point of time for start and end they have the best possible answer till that time
        //and if we are saying only one item is remainng hence cause of above line it is the best possible ans
        return start; // or return end as both are equal
    }
}