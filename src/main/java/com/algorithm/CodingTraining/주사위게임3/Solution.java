package com.algorithm.CodingTraining.주사위게임3;

import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Map<Integer, Integer> countMap = new HashMap<>();

        // 주사위 숫자의 빈도를 계산
        for (int num : dice) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 빈도에 따라 점수 계산
        if (countMap.size() == 1) {
            // 모든 숫자가 동일한 경우
            return 1111 * a;
        } else if (countMap.size() == 2) {
            // 두 숫자로 구성된 경우
            List<Integer> keys = new ArrayList<>(countMap.keySet());
            int first = keys.get(0);
            int second = keys.get(1);
            if (countMap.get(first) == 3 || countMap.get(second) == 3) {
                // 한 숫자가 3번, 나머지 숫자가 1번 등장한 경우
                int p = countMap.get(first) == 3 ? first : second;
                int q = countMap.get(first) == 1 ? first : second;
                return (10 * p + q) * (10 * p + q);
            } else {
                // 두 숫자가 각각 2번 등장한 경우
                return (first + second) * Math.abs(first - second);
            }
        } else if (countMap.size() == 3) {
            // 세 숫자로 구성된 경우 (2개, 1개, 1개)
            int product = 1;
            for (int key : countMap.keySet()) {
                if (countMap.get(key) == 2) {
                    // 두 번 등장한 숫자를 제외하고 곱셈
                    continue;
                }
                product *= key;
            }
            return product;
        } else {
            // 네 숫자가 모두 다른 경우
            return Arrays.stream(dice).min().getAsInt();
        }
    }
}

