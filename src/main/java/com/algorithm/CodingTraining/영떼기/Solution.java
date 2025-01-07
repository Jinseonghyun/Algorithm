package com.algorithm.CodingTraining.영떼기;

class Solution {
    public String solution(String n_str) {
        return "" + Integer.parseInt(n_str);

        // Integer.parseInt(n_str)는 문자열을 정수로 변환
        // 이 과정에서 자동으로 숫자의 앞쪽 0들이 제거
        // 정수를 다시 문자열로 변환 "" + Integer.parseInt(n_str)

        // 정수에서는 앞의 0이 의미가 없습니다 (예: 0010 = 10)
        // Integer.parseInt()는 이 수학적 원리를 따라 앞의 0들을 무시합니다
    }
}
