package com.algorithm.CodingTraining.정수찾기;

class Solution1 {
    public int solution(int[] numList, int n) {
        for(int num : numList) {
            if(num == n) {
                return 1;  // 찾으면 1 반환
            }
        }
        return 0;  // 못 찾으면 0 반환
    }
}
