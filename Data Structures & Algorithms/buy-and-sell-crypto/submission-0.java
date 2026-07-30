class Solution {
    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = 0;

        for(int p : prices){
            minVal = Math.min(minVal, p);
            maxVal = Math.max(maxVal, p - minVal);
        }
        return maxVal;
    }
}
