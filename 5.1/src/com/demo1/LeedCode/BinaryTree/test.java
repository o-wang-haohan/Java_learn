package com.demo1.LeedCode.BinaryTree;

import java.util.Scanner;

public class test {

        // 四个方向：上下左右
        private static final int[] dx = {-1, 1, 0, 0};
        private static final int[] dy = {0, 0, -1, 1};

        // 计算在 n x m 的网格中游游能获得的最大宝物价值
        private static int maxTreasure(int n, int m, int k) {
            // 初始化 DP 数组：dp[steps][i][j]
            int[][][] dp = new int[k + 1][n][m];

            // 初始化起点 (0, 0) 宝物价值为 0
            dp[0][0][0] = 0;

            // 动态规划计算每步的状态
            for (int steps = 1; steps <= k; steps++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        // 当前格子的宝物价值
                        int currentValue = i * m + j;
                        // 更新 dp[steps][i][j]，初始化为一个较小的值
                        dp[steps][i][j] = -1;

                        // 尝试从四个方向来转移状态
                        for (int d = 0; d < 4; d++) {
                            int ni = i + dx[d];
                            int nj = j + dy[d];
                            if (ni >= 0 && ni < n && nj >= 0 && nj < m) {
                                dp[steps][i][j] = Math.max(dp[steps][i][j], dp[steps - 1][ni][nj] + currentValue);
                            }
                        }
                    }
                }
            }

            // 找到走 k 步后能获得的最大宝物价值
            int maxValue = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    maxValue = Math.max(maxValue, dp[k][i][j]);
                }
            }

            return maxValue;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();  // 询问的次数

        // 处理每次询问
        for (int i = 0; i < q; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            // 输出每次询问的最大宝物价值
            System.out.println(maxTreasure(n, m, k));
        }

        scanner.close();
    }

    }

