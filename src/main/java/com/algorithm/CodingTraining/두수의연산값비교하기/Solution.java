package com.algorithm.CodingTraining.두수의연산값비교하기;

class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        return Math.max(Integer.parseInt(sb.append(a).append(b).toString()), 2 * a * b);

        // 중수를 붙여서 쓰기 위해 문자열로 변환
        // Integer.parseInt() : 문자열을 정수로 변환
    }
}
