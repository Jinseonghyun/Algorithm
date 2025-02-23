package com.algorithm.Lv1.성격유형검사하기;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        // 각 성격 유형별 점수를 저장할 Map
        Map<Character, Integer> scores = new HashMap<>();
        // 초기화
        scores.put('R', 0);
        scores.put('T', 0);
        scores.put('C', 0);
        scores.put('F', 0);
        scores.put('J', 0);
        scores.put('M', 0);
        scores.put('A', 0);
        scores.put('N', 0);

        // 각 질문에 대한 응답 처리
        for (int i = 0; i < survey.length; i++) {
            char disagreeType = survey[i].charAt(0); // 비동의 선택 시 점수를 얻는 유형
            char agreeType = survey[i].charAt(1);    // 동의 선택 시 점수를 얻는 유형
            int choice = choices[i];

            if (choice < 4) { // 비동의 관련 선택지
                scores.put(disagreeType, scores.get(disagreeType) + (4 - choice));
            } else if (choice > 4) { // 동의 관련 선택지
                scores.put(agreeType, scores.get(agreeType) + (choice - 4));
            }
            // choice가 4(모르겠음)인 경우는 아무 점수도 얻지 않음
        }

        // 각 지표별로 점수가 높은 성격 유형 또는 동점일 경우 사전순으로 빠른 유형 선택
        StringBuilder result = new StringBuilder();

        // 1번 지표: R vs T
        result.append(getTypeWithHigherScore(scores, 'R', 'T'));
        // 2번 지표: C vs F
        result.append(getTypeWithHigherScore(scores, 'C', 'F'));
        // 3번 지표: J vs M
        result.append(getTypeWithHigherScore(scores, 'J', 'M'));
        // 4번 지표: A vs N
        result.append(getTypeWithHigherScore(scores, 'A', 'N'));

        return result.toString();
    }

    // 두 성격 유형 중 점수가 높은 유형을 반환하는 메소드
    // 동점일 경우 사전순으로 빠른 유형을 반환
    private char getTypeWithHigherScore(Map<Character, Integer> scores, char type1, char type2) {
        int score1 = scores.get(type1);
        int score2 = scores.get(type2);

        if (score1 > score2) {
            return type1;
        } else if (score2 > score1) {
            return type2;
        } else {
            // 동점일 경우 사전순으로 빠른 유형 반환
            return type1 < type2 ? type1 : type2;
        }
    }
}
