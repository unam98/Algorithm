package programmers.kotlin

class Solution_LV1_11 {
    fun solution(x: Int): Boolean {
        val sum = x.toString().toMutableList().map { it.toString().toInt() }.sum()
        return x % sum == 0
    }
}

/*
it을 바로 toInt() 해버리면 아스키 코드 값으로 변환되기 때문에 String으로 먼저 바꿔줘야 함.
 */