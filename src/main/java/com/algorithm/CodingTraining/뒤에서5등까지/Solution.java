package com.algorithm.CodingTraining.뒤에서5등까지;

import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list)
                .sorted()
                .limit(5)
                .toArray();
    }
}
