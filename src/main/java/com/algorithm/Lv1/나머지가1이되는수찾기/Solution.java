package com.algorithm.Lv1.나머지가1이되는수찾기;

class Solution {
    public int solution(int n) {
        for (int x = 2; x < n; x++) {
            if (n % x == 1) {
                return x;
            }
        }
        return n - 1;  // n-1로 나누면 항상 나머지가 1이 됨
    }
}
