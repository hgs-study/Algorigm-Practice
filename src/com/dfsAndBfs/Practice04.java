package com.dfsAndBfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//5. 동전교환
//설명
//다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
//각 단위의 동전은 무한정 쓸 수 있다.
//
//입력
//첫 번째 줄에는 동전의 종류개수 N(1<=N<=12)이 주어진다. 두 번째 줄에는 N개의 동전의 종류가 주어지고,
//그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.각 동전의 종류는 100원을 넘지 않는다.
//
//출력
//첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력한다.
//
//예시 입력 1
//3
//1 2 5
//15

//예시 출력 1
//3
public class Practice04 {

    static int max,total  = 0;
    static int answer = Integer.MAX_VALUE;

    private void dfs(int depth,int sum, Integer[] coinTypes){
        if(sum > total)
            return;
        if(depth > answer)
            return;

        if(sum == total){
            answer = Math.min(answer,depth);
        }else{
            for (int i = 0; i < max; i++) {
                dfs(depth +1, sum + coinTypes[i] , coinTypes);
            }
        }
    }

    public static void main(String[] args) {
        Practice04 practice04 = new Practice04();
        Scanner scanner = new Scanner(System.in);

        max = scanner.nextInt();
        Integer[] coinTypes = new Integer[max];
        for (int i = 0; i < max; i++) {
            coinTypes[i] = scanner.nextInt();
        }
        Arrays.sort(coinTypes, Collections.reverseOrder());
        total = scanner.nextInt();

        practice04.dfs(0,0,coinTypes);
        System.out.println(answer);
    }
}
