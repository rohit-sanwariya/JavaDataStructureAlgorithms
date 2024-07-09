package TwentyOneDaysAirTribe;

import java.util.Arrays;
import java.util.HashMap;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l  = 0,r = nums.length-1,m = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(l<r){
            int s = nums[l] + nums[r];
            if(s == k){

               if(map.containsKey(nums[l]) && map.get(nums[l]) == nums[r]){
                 l++;
                 r--;
               }
               else{
                   m++;
                   map.put(nums[l],nums[r]);
                    l++;
               }

            }
            else{
                if(s > k){
                    r--;
                }
                else{
                    l++;
                }
            }
        }



        return m;


    }
}
