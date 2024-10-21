package LeedCode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/19 下午12:52
 */
public class leedcode93 {
    List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        StringBuilder sb = new StringBuilder(s);
        backtracking(sb,0,0);
        return res;
    }

    public void backtracking(StringBuilder s, int index,int k){

        if(index>=s.length()){
            return;
        }
        if(k==3){
            if(check(s,index,s.length()-1)){
                res.add(s.toString());
            }
            return;
        }


        for(int i = index;i<s.length();i++){
            if(check(s,index,i)==true){
                s.insert(i+1,".");
                k++;
                backtracking(s,i+2,k);
                s.deleteCharAt(i+1);
                k--;
            }
        }
    }
    //左闭右闭区间
    public boolean check(StringBuilder str,int start,int end){
        if(end-start+1>3){
            return false;
        }
        if(start>end){
            return false;
        }
        for(int i = start;i<=end;i++){
            if(str.charAt(i)<'0' || str.charAt(i)>'9'){
                return false;
            }
        }
        if(str.charAt(start)=='0' && start!=end){
            return false;
        }
        if(Integer.parseInt(str.substring(start,end+1))>255){
            return false;
        }
        return true;
    }

}
