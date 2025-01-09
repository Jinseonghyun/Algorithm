package com.algorithm.CodingTraining.카운트업;

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    }
}
