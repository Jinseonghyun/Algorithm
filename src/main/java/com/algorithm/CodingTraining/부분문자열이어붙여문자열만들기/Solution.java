package com.algorithm.CodingTraining.부분문자열이어붙여문자열만들기;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for(int i = 0; i < parts.length; i ++){
            answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }

        return answer;
    }

    // parts[i][0]는 시작 인덱스, parts[i][1]는 끝 인덱스입니다.
    // substring 메서드는 시작 인덱스는 포함하고 끝 인덱스는 포함하지 않기 때문에, parts[i][1] + 1을 사용하여 끝 인덱스를 포함
}
