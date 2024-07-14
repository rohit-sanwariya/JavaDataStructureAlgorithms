package TwentyOneDaysAirTribe;

import java.util.HashMap;

public class ClimbingStairs70 {
    public static HashMap<Integer,Integer> map = new HashMap<>();
    public static int climbStairs(int n) {
       return climb(n);
    }

    public static int climb(int x){
        if(x == 0){
            return 1;
        }
        else if( x < 0){
            return 0;
        }
        else if(map.containsKey(x)){
            return map.get(x);
        }
        else {
           map.put(x-1,climb(x-1));
           map.put(x-2,climb(x-2));
           return map.get(x-1) + map.get(x-2);
        }

    }

    public static void main(String[] args) {
        int x = climbStairs(3);
        System.out.println(x);
    }
}
