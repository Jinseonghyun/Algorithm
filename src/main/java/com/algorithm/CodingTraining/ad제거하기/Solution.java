package com.algorithm.CodingTraining.ad제거하기;

import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(s -> !s.contains("ad")).toArray(String[]::new);

        // 결과를 다시 String 배열로 변환
    }
}
