package com.algorithm.CodingTraining.다섯명씩;

class Solution {
    public String[] solution(String[] names) {
        int idx = 0;
        String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];
        for (int i = 0;i < names.length;i+=5)
            answer[idx++] = names[i];
        return answer;
    }

    // idx 변수를 0으로 초기화하여 결과 배열의 인덱스를 추적합니다.
    // answer 배열의 크기를 결정합니다. names 배열의 길이를 5로 나눈 나머지가 0이면 names.length / 5 크기의 배열을, 그렇지 않으면 names.length / 5 + 1 크기의 배열을 생성합니다.
    // 이는 5개마다 하나의 요소를 선택하기 위해 필요한 배열의 크기를 계산하는 것입니다.
}
