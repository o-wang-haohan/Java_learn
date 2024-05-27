package com.demo1;

import java.util.Random;
import java.util.Scanner;

public class suangsheqiu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[7];
        int [] arr1 = new int[7];

        Random random = new Random();
        for (int i = 0; i<arr1.length;i++){
            if(i<arr1.length-1) {
                arr1[i] = random.nextInt(33) + 1;
                System.out.print(arr1[i]+" ");
            }
            else {
                arr1[i] = random.nextInt(16) + 1;
                System.out.print(arr1[i]);
            }
        }
        for (int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        boolean [] res = new boolean[arr.length];
        for (int i = 0; i<res.length;i++) {
            res[i] = reward(arr, arr1,i);
        }
        int result = 0;
        if((res[0] && res[1] && res[2] && res[3] && res[4] && res[5])==true && res[6]==true){
            result = 10000000;
        } else if((res[0] && res[1] && res[2] && res[3] && res[4] && res[5])==true && res[6]==false){
            result = 5000000;
        }else if((res[0] && res[1] && res[2] && res[3] && res[4])==true && res[6]==true){
            result = 3000;
        }else if((res[0] && res[1] && res[2] && res[3] && res[4])==true && res[6]==false){
            result = 200;
        }else if((res[0] && res[1] && res[2] && res[3])==true && res[6]==true){
            result = 200;
        } else if((res[0] && res[1] && res[2] && res[3])==true && res[6]==false){
            result = 10;
        }else if ((res[0] && res[1] && res[2])==true && res[6]==true) {
            result = 10;
        }else if(res[6]==true && (res[0] && res[1] && res[2])==false){
            result = 5;
        }

        System.out.println(result);
    }

    public static boolean reward(int [] arr,int [] arr1, int a){
        if(arr[a]==arr1[a]){
            return true;
        }else
            return false;
    }
}
