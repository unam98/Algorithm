package programmers.kotlin

class Solution_LV1_10 {
    fun solution(n: Long): Long = n.toString().toMutableList().sortedDescending().joinToString("","","").toLong()
}

/*
sortedDescending() = sorted().reversed()

separator: 요소 사이에 삽입할 구분 문자열입니다. 기본값은 ", "입니다.
prefix: 결과 문자열의 시작에 삽입할 문자열입니다. 기본값은 빈 문자열입니다.
postfix: 결과 문자열의 끝에 삽입할 문자열입니다. 기본값은 빈 문자열입니다.
 */