package com.recursiveAndTreeAndGraph;


// 재귀함수
// 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램을 작성해라.

import java.util.Scanner;

// 입력 : 3
// 출력 : 1 2 3
public class Practice01 {


    //내 풀이
    private static class my {
        public static void solution(int count) {
            int number = 0;
            dfs(count, number);
        }

        public static void dfs(int count, int number) {
            if (count != number) {
                number++;
                System.out.print(number + " ");
                dfs(count, number);
            } else
                return;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count = scanner.nextInt();
            solution(count);
        }
    }

    //강사님 풀이
    private static class teacher {
        public static void dfs(int n){
            if(n==0)
                return;
            else {
                dfs(n - 1);
                System.out.println(n + " "); // 재귀 함수는 스택프레임을 사용한다. 
                                             // 스택프레임엔 : 매개변수, 지역변수, 복귀주소 존재
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count = scanner.nextInt();
            dfs(count);
        }
    }

}
