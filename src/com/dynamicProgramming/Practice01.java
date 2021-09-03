package com.dynamicProgramming;

import java.util.Scanner;

//1. 계단오르기
//설명
//철수는 계단을 오를 때 한 번에 한 계단 또는 두 계단씩 올라간다. 만약 총 4계단을 오른다면 그 방법의 수는
//1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2 로 5가지이다.
//그렇다면 총 N계단일 때 철수가 올라갈 수 있는 방법의 수는 몇 가지인가?
//
//입력
//첫째 줄은 계단의 개수인 자연수 N(3≤N≤35)이 주어집니다.
//
//출력
//첫 번째 줄에 올라가는 방법의 수를 출력합니다.
//
//예시 입력 1
//7

//예시 출력 1
//21

//dp 문젠데 dfs로 풂..
public class Practice01 {
    static int max,count = 0;

    public void dfs(int sum){
        if(sum > max)
            return;

        if(sum == max){
            count++;
            return;
        }else{
            dfs(sum + 1);
            dfs(sum + 2);
        }
    }


    public static void main(String[] args) {
        Practice01 practice01 = new Practice01();
        Scanner scanner = new Scanner(System.in);
        max = scanner.nextInt();
        practice01.dfs(0);

        System.out.println(count);
    }
}
