package com.algorithm.Lv1.추억점수;

import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 결과를 저장할 배열 초기화
        int[] answer = new int[photo.length];

        // 이름과 그리움 점수를 매핑할 HashMap 생성
        HashMap<String, Integer> scoreMap = new HashMap<>();

        // name 배열과 yearning 배열을 매핑하여 HashMap에 저장
        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        // 각 사진별로 추억 점수 계산
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            // 현재 사진에 있는 각 사람별로 점수 합산
            for (String person : photo[i]) {
                // getOrDefault를 사용하여 점수가 없는 경우 0을 반환
                sum += scoreMap.getOrDefault(person, 0);
            }
            answer[i] = sum;
        }

        return answer;
    }
}
