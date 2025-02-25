package com.algorithm.Lv1.최소직사각형;

class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        // 각 명함을 회전시켜서 항상 가로가 세로보다 크거나 같게 만듦
        for (int[] card : sizes) {
            // 각 명함의 긴 쪽을 가로로, 짧은 쪽을 세로로 정렬
            int width = Math.max(card[0], card[1]);
            int height = Math.min(card[0], card[1]);

            // 최대 가로 길이와 최대 세로 길이 업데이트
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }

        // 지갑의 크기 = 최대 가로 길이 * 최대 세로 길이
        return maxWidth * maxHeight;
    }
}
