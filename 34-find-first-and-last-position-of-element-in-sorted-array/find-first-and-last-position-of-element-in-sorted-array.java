class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        //check for 1st occurence if target first 
        // and the true or the false tells you whether you want to find the first or the last element.. true means you are saying true to the searchFirstIndex function false means you're searching for the last occurence
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    //this function just returns the index value of target
    int search(int[] nums,int target,boolean findStartIndex){
        int start = 0;
        int end =  nums.length-1;
         int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<nums[mid]){
                end = mid - 1;
            }
            else if(target>nums[mid]){
                start = mid + 1;
            }
            else{
                //potential answer found
                ans = mid;
                // checks for the first occurence of the target element when true
                if(findStartIndex){
                    end = mid - 1;
                }
                //as it is the false case so it checks for the last occurence of the target element
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}