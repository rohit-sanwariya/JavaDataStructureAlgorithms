package TwentyOneDaysAirTribe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


class MyTime{
   int key;
   String value;
   public MyTime(int key,String value){
       this.key = key;
       this.value = value;
   }
}
public class TimeBasedKeyValueStore981 {
    HashMap<String, List<MyTime>> map;
    public TimeBasedKeyValueStore981() {
        this.map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(this.map.containsKey(key)){
            this.map.get(key).add(new MyTime(timestamp,value));
        }
        else{
            this.map.put(key,new ArrayList<>(List.of(new MyTime(timestamp,value))));
        }
    }

    public String get(String key, int timestamp) {
        if(this.map.containsKey(key)){
            String res = "";
            List<MyTime> list = this.map.get(key);

            int l = 0,r = list.size()-1, m = 0;
            while(l<=r){
                m = l + (r-l)/2;
                if(list.get(m).key <= timestamp ){
                    res = list.get(m).value;
                    l = m + 1;
                }
                else{
                    r =  m-1;
                }
            }
            return "";
        }
        return null;

    }
}
