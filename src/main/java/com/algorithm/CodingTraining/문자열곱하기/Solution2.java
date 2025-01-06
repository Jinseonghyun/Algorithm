package com.algorithm.CodingTraining.문자열곱하기;

import java.util.Collections;

public class Solution2 {
    public String solution(String my_string, int k) {
        return String.join("", Collections.nCopies(k,my_string));

        // join : 여러 문자열을 하나로 연결
        // Collections.nCopies : 지정된 객체의 n개 복사본을 가진 불변 리스트 생성
        // 구분자 없이 my_string을 k번 복제한 리스트 생성
    }
}
