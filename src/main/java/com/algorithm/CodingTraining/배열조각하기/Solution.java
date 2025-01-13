package com.algorithm.CodingTraining.배열조각하기;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length;

        // query 배열을 순회하면서 arr의 범위를 조정
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스: query[i] 이후 부분을 자름
                end = start + query[i] + 1;
            } else {
                // 홀수 인덱스: query[i] 이전 부분을 자름
                start = start + query[i];
            }
        }

        // 최종 범위에 해당하는 부분 배열 생성
        int[] result = new int[end - start];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[start + i];
        }

        return result;
    }
}
