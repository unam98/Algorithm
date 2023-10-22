package programmers.kotlin

class Solution_LV1_12 {
    fun solution(a: Int, b: Int): Long {
        return when {
            a < b -> sum(a, b)
            a == b -> a.toLong()
            a > b -> sum(b, a)
            else -> 0L
        }
    }
    fun sum(start: Int, end: Int): Long {
        var sum = 0L
        for(i in start..end){
            sum += i.toLong()
        }
        return sum
    }
}

/*
 */