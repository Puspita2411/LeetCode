class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            //if the last element of the array is 9 then in ans change it to 0 then again iterate 
            digits[i] = 0;
        }
        //if every element of the array is 9 then the array size should be increased , like [9,9] then ans [1,0,0]
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}