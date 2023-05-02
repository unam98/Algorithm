package inflearn.Array;

import java.util.Scanner;

public class Array_5_2 {
    public int solution(int n) {
        int cnt = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                cnt++;
                for (int j = i; j <= n; j = j + i) ch[j] = 1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Array_5_2 T = new Array_5_2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}

/*
- 소수 구하는 건 에라토스테네스 체 방법이 가장 빠르다고 함
- int 배열은 기본값으로 0이 할당된 채로 생성됨
 */