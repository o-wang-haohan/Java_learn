package com.demo1.LeedCode.BinaryTree;

import java.util.Arrays;
import java.util.Scanner;

public class leedcode654 {

    static final int MAX = 1003;
    static long[][][] dp = new long[MAX][MAX][MAX];
    static int n, m, k;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();

        // 初始化dp数组
        for (int i = 0; i < MAX; i++)
            for (int j = 0; j < MAX; j++)
                Arrays.fill(dp[i][j], Long.MAX_VALUE);

        dp[0][0][0] = 0;

        // 动态规划
        for (int s = 1; s <= k; s++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    long value = (long)j + (long)i * m;
                    if (i > 0 && dp[i-1][j][s-1] != Long.MAX_VALUE) {
                        dp[i][j][s] = Math.min(dp[i][j][s], dp[i-1][j][s-1] + value);
                    }
                    if (j > 0 && dp[i][j-1][s-1] != Long.MAX_VALUE) {
                        dp[i][j][s] = Math.min(dp[i][j][s], dp[i][j-1][s-1] + value);
                    }
                }
            }
        }

        // 找出最小值
        long minValue = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j <= k) {
                    minValue = Math.min(minValue, dp[i][j][k]);
                }
            }
        }

        System.out.println(minValue);
    }
}
