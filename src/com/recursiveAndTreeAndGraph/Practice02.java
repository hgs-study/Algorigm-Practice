package com.recursiveAndTreeAndGraph;

//2. 2진수 구하기
public class Practice02 {

    private void dfs(int n){
        if(n == 0 )
            return;
        else{
            dfs(n/2);
            System.out.print(n%2+ " ");
        }
    }

    public static void main(String[] args) {
        Practice02 practice02 = new Practice02();
        practice02.dfs(11);
    }
}
