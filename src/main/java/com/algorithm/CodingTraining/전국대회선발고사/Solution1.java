package com.algorithm.CodingTraining.전국대회선발고사;

import static java.util.Comparator.comparingInt;
import static java.util.stream.IntStream.range;

class Solution1 {
    public int solution(int[] rank, boolean[] attendance) {
        var array = range(0, rank.length).filter(i -> attendance[i]).boxed().sorted(comparingInt(o -> rank[o])).toArray(Integer[]::new);
        return 10000 * array[0] + 100 * array[1] + array[2];
    }
}