package programmers;

public class Solution_20_1 {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int n : numbers) {
            answer -= n;
        }

        return answer;
    }
}