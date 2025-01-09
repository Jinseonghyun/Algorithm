package com.algorithm.CodingTraining.날짜비교하기;

import java.util.*;

class Solution {
    public int solution(int[] date1, int[] date2) {
        return Arrays.compare(date1, date2) < 0 ? 1 : 0;
    }
}
