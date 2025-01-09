package com.algorithm.CodingTraining.배열의길이를2의거듭제곱으로만들기;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }
}
