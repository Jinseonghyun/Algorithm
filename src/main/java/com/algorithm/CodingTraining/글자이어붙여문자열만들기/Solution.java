package com.algorithm.CodingTraining.글자이어붙여문자열만들기;

class Solution {
    public String solution(String my_string, int[] index_list) {

        StringBuilder sb = new StringBuilder();

        for (int idx : index_list)
            sb.append(my_string.charAt(idx));

        return sb.toString();
    }

    // my_string에서 idx 위치에 있는 문자를 추출하여 sb에 추가합니다. charAt 메서드는 주어진 인덱스에 해당하는 문자를 반환

}
