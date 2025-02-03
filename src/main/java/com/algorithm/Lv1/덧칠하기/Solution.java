package com.algorithm.Lv1.덧칠하기;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int currentPosition = 0;

        // section 배열의 각 위치를 순회
        for (int pos : section) {
            // 현재 위치가 이전에 칠한 범위를 벗어났다면
            if (pos > currentPosition) {
                // 새로운 페인트칠 시작
                answer++;
                // 현재 위치부터 롤러 길이만큼 칠함
                currentPosition = pos + m - 1;
            }
        }

        return answer;
    }
}
