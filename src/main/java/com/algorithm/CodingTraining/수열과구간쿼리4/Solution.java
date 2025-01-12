package com.algorithm.CodingTraining.수열과구간쿼리4;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 원본 배열 복사
        int[] answer = arr.clone();

        // 각 쿼리에 대해 처리
        for (int[] query : queries) {
            int s = query[0];    // 시작 인덱스
            int e = query[1];    // 끝 인덱스
            int k = query[2];    // 배수 기준

            // s부터 e까지 순회
            for (int i = s; i <= e; i++) {
                // k가 0인 경우 처리 (모든 수는 0의 배수가 될 수 없음)
                if (k == 0) continue;

                // i가 k의 배수인 경우 1을 더함
                if (i % k == 0) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}
