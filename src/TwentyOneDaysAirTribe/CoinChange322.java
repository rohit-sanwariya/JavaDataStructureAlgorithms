package TwentyOneDaysAirTribe;

import java.util.Arrays;
import java.util.HashMap;

public class CoinChange322 {
    public static HashMap<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        int x = coinChange(new int[]{1,2,5},11);
        System.out.println(x);
    }
    public  static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];

        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int i = 1; i < amount+1; i++) {
            for (int c : coins) {
                if(i-c>=0){
                    dp[i] = Math.min(dp[i],1+dp[i-c]);

                }
            }
        }
        return dp[amount] != amount + 1 ? dp[amount] : -1;
    }




}
