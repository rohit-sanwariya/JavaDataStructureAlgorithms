package TwentyOneDaysAirTribe;

import Interview.StringPractice.ReverseString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> response = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        ReverseString reverseString = new ReverseString();
        for (int i = 0; i < strs.length; i++) {
            String curr = strs[i];
            String key = reverseString.sort(curr);
            if(map.containsKey(key) == false){
                map.put(key,new ArrayList<>(List.of(curr)));
            }
            else{
                map.get(key).add(curr);

            }
        }

        return new ArrayList<>(map.values());
    }
}
