package com.algorithm.CodingTraining.이의영역;

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        int[] idxs = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray();

        if(idxs.length == 0) {
            int[] zero = {-1};
            return zero;
        }
        else if(idxs.length == 1) {
            int[] one = {2};
            return one;
        }
        else {
            return IntStream.rangeClosed(idxs[0],idxs[idxs.length-1]).map(i->arr[i]).toArray();
        }
    }

    // 2의 위치 찾기 : (filter로 arr[i]가 2인 인덱스만 골라내어 배열로 변환)
    // 2가 없는 경우 : 배열에 2가 없으면 [-1] 반환
    // 2가 하나만 있는 경우 : 배열에 2가 하나만 있으면 [2] 반환
    //  2가 두 개 이상인 경우 : 첫 번째 2와 마지막 2 사이의 모든 원소를 포함하는 부분 배열 반환
    // rangeClosed로 첫 2의 위치부터 마지막 2의 위치까지의 범위 생성
    // ap으로 해당 위치의 실제 값을 가져옴
}