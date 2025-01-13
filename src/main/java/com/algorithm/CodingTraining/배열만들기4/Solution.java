package com.algorithm.CodingTraining.배열만들기4;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {
                // 스택이 비어있으면 현재 원소 추가
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) < arr[i]) {
                // 스택의 마지막 원소가 현재 원소보다 작으면 현재 원소 추가
                stk.add(arr[i]);
                i++;
            } else {
                // 스택의 마지막 원소가 현재 원소보다 크거나 같으면 마지막 원소 제거
                stk.remove(stk.size() - 1);
            }
        }

        // ArrayList를 int 배열로 변환
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }

    /*
        ArrayList를 사용하여 동적 스택(stk)을 구현합니다.
        배열의 크기를 미리 알 수 없으므로 동적 배열이 적합합니다.

        주어진 조건에 따라 반복 처리:
        스택이 비어있으면 현재 원소 추가
        스택의 마지막 원소가 현재 원소보다 작으면 현재 원소 추가
        스택의 마지막 원소가 현재 원소보다 크거나 같으면 마지막 원소 제거

        예시 [1, 4, 2, 5, 3]의 처리 과정:
        Copyi=0: stk=[] -> [1]
        i=1: stk=[1] -> [1,4]
        i=2: stk=[1,4] -> [1] -> [1,2]
        i=3: stk=[1,2] -> [1,2,5]
        i=4: stk=[1,2,5] -> [1,2] -> [1,2,3]

        최종적으로 ArrayList를 int 배열로 변환하여 반환합니다.
    */
}
