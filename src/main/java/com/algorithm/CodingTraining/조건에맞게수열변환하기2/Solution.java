package com.algorithm.CodingTraining.조건에맞게수열변환하기2;

class Solution {
    public int solution(int[] arr) {
        int x = 0;

        while (true) {
            boolean isChanged = false;
            int[] temp = new int[arr.length];

            // 배열의 각 원소를 규칙에 따라 변환
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    temp[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    temp[i] = arr[i] * 2 + 1;
                } else {
                    temp[i] = arr[i];
                }

                // 하나라도 값이 변했는지 확인
                if (temp[i] != arr[i]) {
                    isChanged = true;
                }
            }

            // 배열이 변하지 않았다면 현재 x 반환
            if (!isChanged) {
                return x;
            }

            // 임시 배열의 값을 원래 배열로 복사
            for (int i = 0; i < arr.length; i++) {
                arr[i] = temp[i];
            }

            x++;
        }
    }
}
