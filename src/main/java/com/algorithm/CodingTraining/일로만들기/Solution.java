package com.algorithm.CodingTraining.일로만들기;

import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        return Arrays.stream(num_list).map(i -> Integer.toBinaryString(i).length() - 1).sum();
    }
}
