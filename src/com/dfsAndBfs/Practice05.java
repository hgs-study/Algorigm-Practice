package com.dfsAndBfs;

import java.util.Scanner;

public class Practice05 {

    private static int count = 7;
    private static boolean[][] flag = new boolean[count][count];
    private static int answer = 0;

    private void dfs(int i, int j, int[][] numbers){
        flag[i][j] = true;

        if(i == 7 || j == 7)
            return;

        if(i == 6 && j ==6){
            System.out.println(1111);
            answer += 1;
            return;
        }

        if(numbers[i][j] == 0 && !flag[i][j]){
            dfs(i + 1, j , numbers);
            dfs(i , j + 1 , numbers);
        }
    }

    private void solution(int[][] numbers){
        dfs(0,0,numbers);
        System.out.print(answer);
    }

    public static void main(String[] args) {
        Practice05 practice05 = new Practice05();
        Scanner scanner = new Scanner(System.in);

        int[][] numbers = new int[count][count];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        practice05.solution(numbers);
    }
}
