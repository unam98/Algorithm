package boj.implement;

import java.util.Scanner;

public class Implement_10998_1 {
    public Integer multiplyAB(Integer A, Integer B) {
        Integer answer = A * B;
        return answer;
    }

    public static void main(String[] args) {
        Implement_10998_1 pr = new Implement_10998_1();

        Scanner sc = new Scanner(System.in);

        Integer A = sc.nextInt();
        Integer B = sc.nextInt();

        Integer answer = pr.multiplyAB(A, B);
        System.out.println(answer);
    }
}

/*
두 정수 A,B가 첫줄에 주어졌을 때 이 두개의 곱을 출력
 */