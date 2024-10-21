package LeedCode.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/20 下午3:00
 */
public class leedcode332 {
    private List<String> path;
    List<String> res = new ArrayList<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        Collections.sort(tickets, (a, b) -> a.get(1).compareTo(b.get(1)));
        boolean[] used = new boolean[tickets.size()];
        res.add("JFK");
        backtracking(tickets,used);
        return res;

    }
    public boolean backtracking(List<List<String>> tickets, boolean[] used){
        if(res.size()==tickets.size()+1){
            path = new ArrayList<>(res);
            return true;
        }

        for(int i = 0;i<tickets.size();i++){
            if(!used[i] && tickets.get(i).get(0).equals(res.get(res.size()-1))){
                res.add(tickets.get(i).get(1));
                used[i] = true;
                if(backtracking(tickets,used)){
                    return true;
                }
                used[i] = false;
                res.remove(res.size()-1);
            }

        }
        return false;
    }
}
