package com.algorithm.CodingTraining.배열만들기2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();

        // 5부터 시작하여 모든 가능한 "0"과 "5"로 이루어진 숫자 생성
        for (int i = 5; i <= r; i++) {
            // 숫자를 문자열로 변환하여 각 자릿수 확인
            String numStr = String.valueOf(i);
            boolean isValid = true;

            // 각 자릿수가 0 또는 5인지 확인
            for (char c : numStr.toCharArray()) {
                if (c != '0' && c != '5') {
                    isValid = false;
                    break;
                }
            }

            // 유효한 숫자이고 범위 내에 있다면 결과에 추가
            if (isValid && i >= l) {
                result.add(i);
            }
        }

        // 결과가 없으면 [-1] 반환
        if (result.isEmpty()) {
            return new int[]{-1};
        }

        // List를 배열로 변환
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
