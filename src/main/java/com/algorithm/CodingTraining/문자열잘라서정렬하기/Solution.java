package com.algorithm.CodingTraining.문자열잘라서정렬하기;

import java.util.*;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
    }

}