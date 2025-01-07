package com.algorithm.CodingTraining.꼬리문자열;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution1 {
    public String solution(String[] str_list, String ex) {

        StringBuilder result = new StringBuilder();
        for (String s : str_list) {
            if (!s.contains(ex)) {
                result.append(s);
            }
        }
        return result.toString();
    }
}
