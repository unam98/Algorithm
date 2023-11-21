package programmers.kotlin

class Solution_LV1_19 {
    fun solution(arr: IntArray): IntArray = if (arr.size == 1) intArrayOf(-1)
    else arr.filter {  it != arr.minOrNull() }.toIntArray()
}

/*
제일 작은 수 제거하기
 */