package Interview.Recursion;

import java.util.HashMap;

public class Fibonnaci {
    public int fib(int n){
        return findFib(n,new HashMap<Integer,Integer>());
    }

    private int findFib(int n,HashMap<Integer,Integer> map) {
        if(n <= 1 ){
            return n;
        }
        map.put(n-1,findFib(n-1,map));
        map.put(n-2,findFib(n-2,map));
        return map.get(n-1)+map.get(n-2);
    }
}
