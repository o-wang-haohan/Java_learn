package LeedCode.backtracking;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/20 下午8:50
 */
public class leedcode37 {
    public void solveSudoku(char[][] board) {
        backstracking(board);
        return;
    }

    public boolean backstracking(char[][] board){

        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(char k = 0;k<9;k++){
                        char num = (char)((int)'1'+k);
                        //遍历每个位置的每个数字，如果符合条件就改变为数字
                        if(check(board,board.length,i,j,num)){
                            board[i][j] = num;
                            //当叶子节点的分支找到正确答案
                            //就立即返回true，然后直接一层一层传送到根节点；
                            boolean result = backstracking(board);
                            if(result==true) return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }

        }
        return true;
    }

    public boolean check(char[][] board, int n,int row,int column,char num){
        for(int i = 0;i<n;i++){
            if(board[row][i]==num || board[i][column]==num){
                return false;
            }
        }
        //这里记得除3后乘3才能到达原始位置；
        for(int i = (row/3)*3;i<(row/3)*3+3;i++){
            for(int j = (column/3)*3;j<(column/3)*3+3;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
}
