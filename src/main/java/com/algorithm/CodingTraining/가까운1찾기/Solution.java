package com.algorithm.CodingTraining.가까운1찾기;

class Solution {
    public int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++)
            if (arr[i] == 1)
                return i;
        return -1;
    }
}