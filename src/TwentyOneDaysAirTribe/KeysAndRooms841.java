package TwentyOneDaysAirTribe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeysAndRooms841 {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        DFS(rooms,seen,0);
        for(boolean x : seen){
            if(!x){
                return false;
            }
        }

        return true;
    }

    public static void  DFS(List<List<Integer>> rooms,boolean[] seen , int index){
        seen[index] = true;
        for (int room: rooms.get(index)){
            if(!seen[room]){
                DFS(rooms,seen,room);
            }
        }
    }

    public static void main(String[] args) {
//      [[1,3],[3,0,1],[2],[0]]
       boolean x =  canVisitAllRooms(new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1,3)),
                new ArrayList<>(Arrays.asList(3,0,1)),
                new ArrayList<>(Arrays.asList(2)),
                new ArrayList<>(Arrays.asList(0))
        )) );
        System.out.println(x);
    }
}
