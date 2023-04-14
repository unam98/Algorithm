package inflearn.Array;

import java.util.Scanner;

public class Array_5_1 {

    public boolean isAnswer(Integer checkNum) {

        if (checkNum < 2) return false;

        if (checkNum == 2) return true;
        for (int i = 2; i < checkNum; i++) {

            if (checkNum % i == 0) {
                return false;
            }
        }
        return true;
    }


    public int solution(Integer inputNum) {

        int count = 0;

        for (int i = 0; i < inputNum; i++) {
            if (isAnswer(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Array_5_1 problem = new Array_5_1();

        Scanner in = new Scanner(System.in);

        int inputNum = in.nextInt();

        int answer = problem.solution(inputNum);

        System.out.println(answer);
    }
}

/*
요구에 맞게 출력은 뽑아낼 수 있는데 시간 제한에 걸림.
 */