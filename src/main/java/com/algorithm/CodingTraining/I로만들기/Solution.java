package com.algorithm.CodingTraining.I로만들기;

class Solution {
    public String solution(String myString) {
        return myString.replaceAll("[^l-z]", "l");
    }

    // 'l'에서 'z' 사이의 문자를 제외한 모든 문자를 의미합니다.
    // 즉, 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'를 제외한 모든 문자를 찾습니다.
    //이 패턴에 해당하는 모든 문자를 'l'로 대체하여 반환
}
