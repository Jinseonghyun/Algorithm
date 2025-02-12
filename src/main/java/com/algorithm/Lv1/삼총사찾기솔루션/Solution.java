package com.algorithm.Lv1.삼총사찾기솔루션;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int n = number.length;

        // 3중 반복문으로 모든 가능한 조합 확인
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // 세 수의 합이 0인 경우 카운트 증가
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    /* "3명의" 학생을 선택해야 합니다
    i는 n-2까지: 뒤에 2명을 더 선택해야 하므로
    j는 i+1부터: i보다 큰 수부터 시작하여 중복 방지
    k는 j+1부터: j보다 큰 수부터 시작하여 중복 방지
    * */
}
