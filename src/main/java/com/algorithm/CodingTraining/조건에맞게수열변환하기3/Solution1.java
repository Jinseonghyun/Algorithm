package com.algorithm.CodingTraining.조건에맞게수열변환하기3;

class Solution1 {
    public int[] solution(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            if (k % 2 != 0) {
                arr[i] *= k;
            } else {
                arr[i] += k;
            }
        }

        return arr;
    }
}
