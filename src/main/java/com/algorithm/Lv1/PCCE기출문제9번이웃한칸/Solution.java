package com.algorithm.Lv1.PCCE기출문제9번이웃한칸;

class Solution {
    public int solution(String[][] board, int h, int w) {
        // 1. 보드의 크기를 저장
        int n = board.length;

        // 2. 같은 색상 카운트 변수 초기화
        int count = 0;

        // 3. 상하좌우 이동을 위한 방향 배열 정의
        int[] dh = {0, 1, -1, 0};  // 행 방향 변화량
        int[] dw = {1, 0, 0, -1};  // 열 방향 변화량

        // 4. 상하좌우 칸 확인
        for (int i = 0; i < 4; i++) {
            // 4-1. 확인할 칸의 좌표 계산
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            // 4-2. 좌표가 보드 범위 내에 있는지 확인
            if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                // 4-2-a. 같은 색상인지 확인
                if (board[h][w].equals(board[h_check][w_check])) {
                    count++;
                }
            }
        }

        // 5. 결과 반환
        return count;
    }
}
