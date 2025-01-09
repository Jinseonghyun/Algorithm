package com.algorithm.CodingTraining.특별한이차원배열2;

import java.util.stream.*;

class Solution {
    public int solution(int[][] arr) {
        return IntStream.range(0, arr.length).allMatch(i -> IntStream.range(i + 1, arr.length).allMatch(j -> arr[i][j] == arr[j][i])) ? 1 : 0;
    }
}
