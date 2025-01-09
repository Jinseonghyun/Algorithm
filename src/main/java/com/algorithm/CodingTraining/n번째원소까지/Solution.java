package com.algorithm.CodingTraining.n번째원소까지;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }
    // rrays.copyOfRange(num_list, 0, n)는 num_list 배열의 인덱스 0부터 n까지의 요소를 복사하여 새로운 배열을 반환합니다.
    // 여기서 n은 비포함 범위이므로, 실제로는 인덱스 0부터 n-1까지의 요소가 포함됩니다.
}
