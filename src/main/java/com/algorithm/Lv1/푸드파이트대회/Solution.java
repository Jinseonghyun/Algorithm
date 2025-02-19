package com.algorithm.Lv1.푸드파이트대회;

class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();

        // 1. 왼쪽 선수가 먹을 음식 배치 구성
        for (int i = 1; i < food.length; i++) {
            // 각 음식을 2로 나눈 몫만큼 반복하여 추가
            // (양쪽 선수가 동일하게 먹어야 하므로)
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                left.append(i);
            }
        }

        // 2. 왼쪽 배치 + 물(0) + 왼쪽 배치 뒤집기
        // left + "0" + left.reverse()를 하면 됨
        return left.toString() + "0" + left.reverse().toString();
    }
}
