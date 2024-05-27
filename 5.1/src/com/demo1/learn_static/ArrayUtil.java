package com.demo1.learn_static;

import java.util.ArrayList;

public class ArrayUtil {
    private ArrayUtil(){}

    public static String printArr(ArrayList<Integer> arr){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i<arr.size(); i++){
            if(i==arr.size()-1){
                sb.append(arr.get(i));
            }else {
                sb.append(arr.get(i)).append(",");
            }

        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double [] p){
        double sum = 0;
        for (int i = 0; i<p.length; i++){
            sum += p[i];
        }
        sum/=p.length;
        return sum;
    }
}
