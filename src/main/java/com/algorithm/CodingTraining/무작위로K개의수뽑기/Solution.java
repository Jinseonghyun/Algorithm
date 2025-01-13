package com.algorithm.CodingTraining.무작위로K개의수뽑기;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        // 중복을 제거하기 위한 HashSet 생성
        HashSet<Integer> set = new HashSet<>();
        int[] answer = new int[k];
        int index = 0;

        // arr 배열을 순회하면서 중복되지 않은 수만 answer에 추가
        for (int num : arr) {
            // 현재 숫자가 set에 없고, answer 배열이 아직 다 차지 않았을 때
            if (!set.contains(num) && index < k) {
                set.add(num);
                answer[index++] = num;
            }
        }

        // 나머지 자리를 -1로 채움
        while (index < k) {
            answer[index++] = -1;
        }

        return answer;
    }

    /*
        HashSet을 사용하여 중복된 숫자를 제거합니다:
        HashSet은 중복을 자동으로 제거하는 자료구조입니다.

        k 크기의 결과 배열을 생성합니다.
        arr 배열을 순회하면서:
        현재 숫자가 HashSet에 없으면 (처음 등장한 숫자)
        결과 배열에 아직 공간이 있으면 (index < k)
        해당 숫자를 HashSet과 결과 배열에 추가

        결과 배열에 빈 공간이 남아있으면 -1로 채웁니다.
    */
}
