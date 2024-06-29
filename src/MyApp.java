import Interview.Recursion.Fibonnaci;
import TwentyOneDaysAirTribe.CombinationSum39;
import TwentyOneDaysAirTribe.ReverseVowelsOfString345;

import java.util.Arrays;

public class MyApp {
    public static void main(String[] args) {
        CombinationSum39 combinationSum39 = new CombinationSum39();
        combinationSum39.combinationSum(new int[]{2,3,6,7},7);
        Fibonnaci fibonnaci = new Fibonnaci();
        int x = fibonnaci.fib(9);
        System.out.println(x);
    }
}
