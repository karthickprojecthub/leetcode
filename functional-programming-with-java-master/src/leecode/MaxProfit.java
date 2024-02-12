package leecode;

public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result1 = maxProfitEfficient(prices);
        int result2 = maxProf(prices);
        System.out.println("Maximum profit (Efficient): " + result1);
        System.out.println("Maximum profit (Efficient): " + result2);
    }

    public static int maxProfitEfficient(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }

    public static int maxProf(int[] prices){
        int min = prices[0];
        int max = 0;
        for(int i=1; i<=prices.length-1; i++){
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }

        return max;
    }
}
