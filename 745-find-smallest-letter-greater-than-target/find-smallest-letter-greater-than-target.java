// Same as the ceiling of a number (but we won't return the same element , the ans will be greater than the target element but it will be smallest element in the array )

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<letters[mid]){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        //used for the wrap around ... means if no character of the array is greater than the target element then return the first element
        return letters[start % letters.length];
    }
}