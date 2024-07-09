package TwentyOneDaysAirTribe;

import java.util.HashMap;

public class LongestPallindrome409 {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c) == false){
                map.put(c,1);
            }
            else {
                map.put(c,map.get(c)+1);
                if(map.get(c) % 2 == 0){
                    res += 2;
                }
            }
        }
        for (int val: map.values()){
            if(val%2 != 0){
                res = res + 1;
                break;
            }
        }

        return res;
    }
}
