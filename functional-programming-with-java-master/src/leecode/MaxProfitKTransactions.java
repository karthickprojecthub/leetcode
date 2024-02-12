package leecode;

public class MaxProfitKTransactions {

    public static int maxProfit(int k, int[] prices) {
        int n = prices.length;

        // If k is large enough, the problem becomes the same as the "Best Time to Buy and Sell Stock II" problem.
        if (k >= n / 2) {
            return maxProfitUnlimitedTransactions(prices);
        }

        int[][] dp = new int[k + 1][n];

        for (int i = 1; i <= k; i++) {
            int maxDiff = -prices[0];
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], prices[j] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[i - 1][j] - prices[j]);
            }
        }

        return dp[k][n - 1];
    }

    private static int maxProfitUnlimitedTransactions(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int k = 2;
        int[] prices = {3,2,6,5,0,3};

        int result = maxProfit(k, prices);

        System.out.println("Maximum Profit: " + result);
    }
}

