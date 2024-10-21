package LeedCode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/20 下午4:26
 */
public class leedcode51 {
    List<List<String>> res = new ArrayList<>();
    List<String> list = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] nn = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                nn[i][j] = '.';
            }
        }
        backtracking(nn,n,0);
        return res;
    }

    public void backtracking(char[][] nn, int n, int row){
        if(row==n){
            res.add(new ArrayList<>(list));
            return;
        }
        //i控制列，row控制行，每一层是通过行row来控制
        for(int i = 0;i<n;i++){
            if(!check(nn,row,i,n)){
                continue;
            }
            nn[row][i]='Q';
            //char数组转字符串
            list.add(String.copyValueOf(nn[row]));
            backtracking(nn,n,row+1);
            nn[row][i]='.';
            list.remove(list.size()-1);
        }
    }

    public boolean check(char[][] nn, int row, int column, int n){
        for(int i = 0;i<n;i++){
            if(nn[row][i]=='Q'|| nn[i][column]=='Q'){
                return false;
            }
        }
        //只需检查左上角，因为下面的行暂时没有访问到
        for(int i = row,j = column;i>=0 &&j>=0;i--,j--){
            if(nn[i][j]=='Q'){
                return false;
            }
        }
        //只需检查右上角，因为下面的行暂时没有访问到
        for(int i = row,j = column; i>=0 && j<n;i--,j++){
            if(nn[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}
