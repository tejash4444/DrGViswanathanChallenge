public class StockProfit {

    public static int maxProfit(int[] prices) {

        int min = prices[0];
        int prof = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            }
            else if (prices[i] - min > prof) {
                prof = prices[i] - min;
            }
        }

        return prof;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}