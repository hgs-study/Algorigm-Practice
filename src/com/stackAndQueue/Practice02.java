package com.stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

//2. 괄호문자제거
//설명
//입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
//
//입력
//첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
//
//출력
//남은 문자만 출력한다.
//
//예시 입력 1
//(A(BC)D)EF(G(H)(IJ)K)LM(N)

//예시 출력 1
//EFLM
public class Practice02 {

    private void solution(String str){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.toCharArray().length; i++) {
            if(stack.isEmpty() && i != 0 && str.toCharArray()[i] != '(' && str.toCharArray()[i] != ')') {
                System.out.print(str.toCharArray()[i]);
            }
            else{
                if(str.toCharArray()[i] == ')') {
                    if (stack.peek() == '(')
                        stack.pop();
                    else if (stack.peek() == ')')
                        stack.add(')');
                }
                else if(str.toCharArray()[i] == '(')
                    stack.add('(');
            }
        }
    }

    public static void main(String[] args) {
        Practice02 practice02 = new Practice02();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        practice02.solution(str);
    }
}
