package com.algorithm.Lv1.카드뭉치;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Index = 0;  // cards1의 현재 위치를 추적하는 포인터
        int cards2Index = 0;  // cards2의 현재 위치를 추적하는 포인터

        // goal 배열의 각 단어를 순회하면서 확인
        for (String targetWord : goal) {
            // cards1에서 현재 단어를 찾을 수 있는지 확인
            if (cards1Index < cards1.length && targetWord.equals(cards1[cards1Index])) {
                cards1Index++;
                continue;
            }

            // cards2에서 현재 단어를 찾을 수 있는지 확인
            if (cards2Index < cards2.length && targetWord.equals(cards2[cards2Index])) {
                cards2Index++;
                continue;
            }

            // 두 카드 뭉치 어디에서도 현재 단어를 찾을 수 없다면 "No" 반환
            return "No";
        }

        // 모든 단어를 순서대로 찾을 수 있었다면 "Yes" 반환
        return "Yes";
    }
}
