package com.algorithm.CodingTraining.문자열여러번뒤집기;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        // 각 쿼리를 순서대로 처리
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            // 시작부터 끝까지의 부분 문자열을 뒤집기
            String reversed = new StringBuilder(sb.substring(start, end + 1))
                    .reverse()
                    .toString();

            // 뒤집은 부분을 원래 문자열에 다시 삽입
            sb.replace(start, end + 1, reversed);
        }

        return sb.toString();
    }

    /*
        StringBuilder를 사용하여 문자열을 효율적으로 수정할 수 있게 합니다.

        String은 불변(immutable)이므로 StringBuilder를 사용하면 더 효율적입니다.

        각 쿼리에 대해:
        start와 end 인덱스를 추출합니다.
        해당 구간의 문자열을 추출하여 뒤집습니다.
        뒤집은 문자열을 원래 위치에 다시 삽입합니다.
        최종적으로 수정된 문자열을 반환합니다.

        예시로 "rermgorpsam"에 대해 쿼리 [[2, 3], [0, 7], [5, 9], [6, 10]]를 처리하면:

        [2, 3]: "rermgorpsam" → "remrgorpsam"
        [0, 7]: "remrgorpsam" → "progrmersam"
        [5, 9]: "progrmersam" → "prograsremm"
        [6, 10]: "prograsremm" → "programmers"

        시간 복잡도는 O(n * q)입니다. 여기서:

        n은 문자열의 길이
        q는 쿼리의 개수
    */
}
