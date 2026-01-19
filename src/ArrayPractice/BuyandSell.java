package ArrayPractice;

public class BuyandSell {
    public static int buyAndSellStocks(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                MaxProfit = Math.max(MaxProfit, profit);
            }
            else{
                buyprice = prices[i];
            }
        }
        return MaxProfit;
    }

    public static void main(String[] args){
        int[] prices = {1,4,98,75,87,456};
        int finalAmt = buyAndSellStocks(prices);
        System.out.println(finalAmt);
    }
}
