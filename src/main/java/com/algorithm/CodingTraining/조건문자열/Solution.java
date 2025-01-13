package com.algorithm.CodingTraining.조건문자열;

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        // >= 조건
        if (ineq.equals(">") && eq.equals("=")) {
            return n >= m ? 1 : 0;
        }
        // <= 조건
        if (ineq.equals("<") && eq.equals("=")) {
            return n <= m ? 1 : 0;
        }
        // > 조건
        if (ineq.equals(">") && eq.equals("!")) {
            return n > m ? 1 : 0;
        }
        // < 조건
        if (ineq.equals("<") && eq.equals("!")) {
            return n < m ? 1 : 0;
        }

        return 0; // 기본 반환값
    }

    /*
    * 각각의 경우에 대해 조건문으로 처리:

    ">=" : ineq가 ">"이고 eq가 "="일 때
    "<=" : ineq가 "<"이고 eq가 "="일 때
    ">" : ineq가 ">"이고 eq가 "!"일 때
    "<" : ineq가 "<"이고 eq가 "!"일 때


    각 조건문에서는 삼항 연산자를 사용하여:

    조건이 참이면 1 반환
    조건이 거짓이면 0 반환
    */
}
