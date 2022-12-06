public int maxProfit(int[] prices) {
        int latestLowPrice = prices[0];
        int ans = 0;
        for(int e : prices) {
            if (e < latestLowPrice)
                latestLowPrice = e;
            else {
                ans = Math.max(e - latestLowPrice, ans);
            }
        }
        return ans;
    }
