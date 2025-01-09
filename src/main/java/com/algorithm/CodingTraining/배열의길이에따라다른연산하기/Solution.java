package com.algorithm.CodingTraining.배열의길이에따라다른연산하기;

class Solution {
    public int[] solution(int[] arr, int n) {
        int idx = arr.length % 2 == 0 ? 1 : 0;
        for (int i = idx;i < arr.length;i += 2)
            arr[i] += n;
        return arr;
    }
}

