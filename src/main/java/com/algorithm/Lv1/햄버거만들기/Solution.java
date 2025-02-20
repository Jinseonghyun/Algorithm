package com.algorithm.Lv1.햄버거만들기;

import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> stack = new ArrayList<>();

        // 재료를 하나씩 스택에 쌓으면서 확인
        for (int i : ingredient) {
            stack.add(i);

            // 스택의 크기가 4 이상이고 마지막 4개 원소가 햄버거 패턴과 일치하는지 확인
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size-4) == 1 &&
                        stack.get(size-3) == 2 &&
                        stack.get(size-2) == 3 &&
                        stack.get(size-1) == 1) {

                    // 햄버거가 완성되면 마지막 4개 원소 제거
                    for (int j = 0; j < 4; j++) {
                        stack.remove(stack.size()-1);
                    }
                    answer++;
                }
            }
        }

        return answer;
    }
}