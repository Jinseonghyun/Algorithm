package com.algorithm.CodingTraining.문자열곱하기;

class Solution1 {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();   // 문자열 수정 시 새로운 객체 생성하지 않음 (가변 문자열 객체 생성)
        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }
        return sb.toString(); // StringBuilder는 문자열 타입(String)이 아님 String으로 변환해야 최종 결과 반환
    }
}
