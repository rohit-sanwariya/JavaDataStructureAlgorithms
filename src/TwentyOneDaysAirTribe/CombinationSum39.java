package TwentyOneDaysAirTribe;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> response  = new ArrayList<>();
        DFS(candidates,response,0,new ArrayList<>(), target);
        return response;
    }
    private void DFS(int[] candidates,List<List<Integer>> response, int index,List<Integer> curr,  int target){
        if(index ==  candidates.length){
            if(target == 0){
                response.add(new ArrayList<>(curr));
            }
            return;
        }
        if(candidates[index]<=target){
            curr.add(candidates[index]);
            DFS(candidates, response, index, curr, target-candidates[index] );
            curr.remove(curr.size() - 1);
        }
        DFS(candidates, response, index+1, curr, target);

    }
}
