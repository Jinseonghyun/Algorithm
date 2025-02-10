package com.algorithm.Lv1.과일장수;

import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 1. 점수를 내림차순으로 정렬
        Arrays.sort(score);

        // 2. 뒤에서부터 m개씩 그룹화하여 계산
        // 마지막 인덱스부터 시작하여 m개씩 건너뛰며 각 그룹의 최소값 계산
        for (int i = score.length; i >= m; i -= m) {
            // 각 상자의 최소값은 i-m 인덱스의 값
            // (i-m)의 값이 해당 그룹에서 가장 작은 값이 됨
            answer += score[i - m] * m;
        }

        return answer;
    }
}
