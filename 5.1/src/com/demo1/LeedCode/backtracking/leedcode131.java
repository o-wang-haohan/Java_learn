package LeedCode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/18 下午4:19
 */
public class leedcode131 {
    List<List<String>> res = new ArrayList<>();
    List<String> list = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtracking(s,0);
        return res;
    }
    //index表示分割的位置
    public void backtracking(String s, int index){
        if(index==s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        if(index>s.length()){
            return;
        }

        for(int i =index;i<s.length();i++){
            if(isPalindrome(s,index,i)==true){
                list.add(s.substring(index,i+1));
                backtracking(s,i+1);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s , int start, int end){
        for(int i = start,j=end; i<=(end-start)/2+start;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
