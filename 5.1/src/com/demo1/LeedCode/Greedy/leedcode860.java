package com.demo1.LeedCode.Greedy;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/24 上午10:29
 */
public class leedcode860 {
    public boolean lemonadeChange(int[] bills) {
        int[] money = new int[3];
        for(int i = 0;i<bills.length;i++){
            if(bills[i]==5){
                money[0]++;
            }else if(bills[i]==10){
                money[0]--;
                if(money[0]<0){
                    return false;
                }
                money[1]++;
            }else{
                if(money[1]>0 && money[0]>0){
                    money[1]--;
                    money[0]--;
                }else if(money[1]==0 && money[0]>0){
                    money[0]-=3;
                    if(money[0]<0){
                        return false;
                    }
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
