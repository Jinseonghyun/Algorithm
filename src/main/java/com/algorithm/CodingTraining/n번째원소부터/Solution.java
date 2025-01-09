package com.algorithm.CodingTraining.n번째원소부터;

import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] a = Arrays.copyOfRange(num_list, n-1, num_list.length);
        return a;
    }
    // num_list 배열의 인덱스 n−1부터 배열의 끝까지의 요소를 복사하여 새로운 배열 a를 생성합니다.
    // n-1을 사용하는 이유는 배열의 인덱스가 0부터 시작하기 때문입니다. 예를 들어, n이 1이면 인덱스 0부터 시작하여 첫 번째 요소를 포함하게 됩니다.
}
