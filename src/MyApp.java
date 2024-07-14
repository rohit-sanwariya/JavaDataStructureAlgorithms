import Interview.Array.ReverseArray;
import Interview.Recursion.Fibonnaci;
import Interview.StringPractice.ReverseString;
import TwentyOneDaysAirTribe.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MyApp {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()){
            System.out.println(queue.removeFirst());
        }
    }
}
