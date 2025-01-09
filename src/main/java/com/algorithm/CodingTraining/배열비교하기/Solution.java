package com.algorithm.CodingTraining.배열비교하기;

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);

        if(answer == 0) {
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }

        return answer;

        // Integer.compare(x, y)는 다음과 같이 동작합니다:
        // x < y 이면 -1 반환
        // x == y 이면 0 반환
        // x > y 이면 1 반환
        // 여기서는 먼저 두 배열의 길이를 비교합니다

        // 배열 길이가 같은 경우(answer == 0)에만 실행됩니다
        // IntStream.of(arr).sum()로 각 배열의 모든 요소의 합을 계산합니다
        // 두 배열의 합을 비교하여 결과를 저장
    }
}