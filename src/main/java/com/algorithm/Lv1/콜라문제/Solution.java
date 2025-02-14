package com.algorithm.Lv1.콜라문제;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remainingBottles = n;

        // 남은 병이 교환 가능한 수(a) 이상일 때까지 반복
        while (remainingBottles >= a) {
            // 현재 가진 병으로 교환 가능한 콜라의 수 계산
            int exchangeableGroups = remainingBottles / a;
            int newColas = exchangeableGroups * b;

            // 받은 콜라의 수를 정답에 추가
            answer += newColas;

            // 남은 병의 수 업데이트
            // (교환하고 남은 병 + 새로 받은 콜라)
            remainingBottles = (remainingBottles % a) + newColas;
        }

        return answer;
    }
}
