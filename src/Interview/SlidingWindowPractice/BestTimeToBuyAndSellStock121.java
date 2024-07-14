package Interview.SlidingWindowPractice;

public class BestTimeToBuyAndSellStock121 {
    public static int maxProfit(int[] prices) {
        int left = 0 ,right = 1, curr = -1;
        while(right<prices.length){
            if(prices[left] < prices[right]){
                curr = Math.max(curr,prices[left] - prices[right]);
            }
            else{
                left = right;
            }
            right++;
        }
        return curr;
    }

    public static void main(String[] args) {
        maxProfit(new int[] { 7,1,5,3,6,4 });
    }
}
