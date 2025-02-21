package com.algorithm.Lv1.숫자짝궁;

import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        // 각 숫자(0-9)의 등장 횟수를 세는 두 개의 카운터 배열 생성
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        // X의 각 숫자 카운트
        for (char digit : X.toCharArray()) {
            xCount[digit - '0']++;
        }

        // Y의 각 숫자 카운트
        for (char digit : Y.toCharArray()) {
            yCount[digit - '0']++;
        }

        // 공통 숫자를 찾고 내림차순으로 결과 생성 (가장 큰 수를 만들기 위해)
        StringBuilder result = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(xCount[i], yCount[i]);
            for (int j = 0; j < commonCount; j++) {
                result.append(i);
            }
        }

        // 결과가 없으면 "-1" 반환
        if (result.length() == 0) {
            return "-1";
        }

        // 결과가 0으로만 구성되어 있으면 "0" 반환
        if (result.charAt(0) == '0') {
            return "0";
        }

        return result.toString();
    }
}
