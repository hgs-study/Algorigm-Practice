package com.array;

import java.util.Scanner;

//2. 보이는 학생
//설명
//선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
//선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
//
//입력
//첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
//
//출력
//선생님이 볼 수 있는 최대학생수를 출력한다.
//
//예시 입력 1
//8
//130 135 148 140 145 150 150 153

//예시 출력 1
//5
public class Practice02 {

    static int count,max = 0;

    public int solution(int[] numbers){
        max = numbers[0];
        count = 1;
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Practice02 practice02 = new Practice02();
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(practice02.solution(numbers));
    }
}
