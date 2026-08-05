class Solution {
    public int maximumWealth(int[][] accounts) {
        //person = row,  account = col
        int ans = Integer.MIN_VALUE;
        for(int person =0; person<accounts.length;person++){
            int sum = 0;
            for(int account = 0; account<accounts[person].length;account++){
                //when you start a new col, take a new sum for that row
                sum += accounts[person][account];
            }
            //now we have the sum of accounts of a person
            //check with overall answer 
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}