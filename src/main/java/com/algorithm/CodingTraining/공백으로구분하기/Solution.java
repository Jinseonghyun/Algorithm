package com.algorithm.CodingTraining.공백으로구분하기;

class Solution {
    public String[] solution(String my_string) {
        return my_string.trim().split("[ ]+");
    }

    // my_string.trim()은 문자열의 앞뒤 공백을 제거합니다
    // 예: "  Hello World  " → "Hello World"

    // split("[ ]+")의 의미
    // [ ]: 공백 문자를 의미하는 정규표현식
    // +: 앞의 패턴(여기서는 공백)이 1회 이상 반복됨을 의미
    // 즉, [ ]+는 '하나 이상의 연속된 공백'을 의미


    // 입력: "   I  love  Java   "
    // 과정:
    // 1. trim() 적용 후: "I  love  Java"
    // 2. split("[ ]+") 적용 후: ["I", "love", "Java"]
}
