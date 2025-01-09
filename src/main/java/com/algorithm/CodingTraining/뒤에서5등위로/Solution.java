package com.algorithm.CodingTraining.뒤에서5등위로;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        return Arrays.stream(numList).sorted().skip(5).toArray();
    }
}
