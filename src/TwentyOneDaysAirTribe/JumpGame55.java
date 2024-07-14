package TwentyOneDaysAirTribe;

import java.util.HashMap;

public class JumpGame55 {
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
        dp[0] = true;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && j + nums[j] >= i) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n - 1];
    }
    public static boolean canJumpGreedy(int[] nums) {
        int last = nums.length-1;
        for (int i = nums.length-2; i>=0 ; i--) {
            if(i+nums[i] >= last){
                last = i;
            }
        }
        return last == 0;
    }

    public static void main(String[] args) {
        canJumpGreedy(new int[]{2,3,1,1,4});
    }
}
