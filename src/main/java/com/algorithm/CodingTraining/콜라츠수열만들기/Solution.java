package com.algorithm.CodingTraining.콜라츠수열만들기;

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.concat(
                        IntStream.iterate(n, i -> i > 1, i -> i % 2 == 0 ? i / 2 : i * 3 + 1),
                        IntStream.of(1))
                .toArray();
    }

    // ntStream.iterate는 초기값 n에서 시작하여, 주어진 조건(i > 1)이 참인 동안 반복합니다.
    // 각 반복에서 i가 짝수인지 홀수인지에 따라 다음 값을 결정합니다. 짝수일 경우 i / 2, 홀수일 경우 3 * i + 1을 계산합니다.

    // 생성된 스트림과 IntStream.of(1)을 연결(concat)합니다. 이는 수열이 1에 도달했을 때 1을 포함
}
