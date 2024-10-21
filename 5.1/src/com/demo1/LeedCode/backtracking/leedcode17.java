package LeedCode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/18 上午11:02
 */
public class leedcode17 {

    List<String> lists = Arrays.asList("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz");
    List<String> res = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    public List<String> letterCombinations(String digits){
        //字符串是引用数据类型，需要使用equals方法
        if(digits.equals("")){
            return res;
        }
        List<Integer> dig = new ArrayList<>();
        for(int i = 0;i<digits.length();i++){
            dig.add(digits.charAt(i)-'0');
        }
        backtracking(dig,0);
        return res;
    }
    public void backtracking(List<Integer> dig, int index){
        if(index == dig.size()){
            res.add(sb.toString());
            return;
        }
        //index表示当前遍历到哪个位置
        //当前遍历数字的哪个位置
        //一定要看循环的是什么
        //每层循环的本质是数字对应集合的字符串
        //所以for循环控制的是字符串的遍历
        int list_index = dig.get(index);
        String str = lists.get(list_index);
        for(int i = 0;i<str.length();i++){
            sb.append(str.charAt(i));
            index++;
            backtracking(dig,index);
            sb.deleteCharAt(sb.length()-1);
            index--;
        }
    }
}
