package inflearn.Chapter5;

import java.util.Scanner;
import java.util.Stack;

public class Chapter5_3_1 {

    public Integer solution(int[][] board, int[] moves) {
        Integer count = 0;

        Stack<Integer> stack = new Stack<>();

        for (Integer lineNum : moves) {
            for (int i = 0; i < board.length; i++) {
                Integer item = board[i][lineNum - 1];
                if (item != 0) {
                    if (stack.isEmpty()) {
                        stack.push(item);
                        board[i][lineNum - 1] = 0;
                    } else {
                        if (stack.peek().equals(item)) {
                            stack.pop();
                            board[i][lineNum - 1] = 0;
                            count += 2;
                        } else {
                            stack.push(item);
                            board[i][lineNum - 1] = 0;
                        }
                    }
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer N = sc.nextInt();
        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        Integer L = sc.nextInt();

        int[] moves = new int[L];

        for (int i = 0; i < L; i++) {
            moves[i] = sc.nextInt();
        }

        Chapter5_3_1 T = new Chapter5_3_1();
        Integer answer = T.solution(board, moves);
        System.out.println(answer);
    }
}

/*

7시 7분

1) N을 입력 받는다
2) N x N 사이즈 만큼의 2차원 배열을 입력받는다
3) moves 배열의 size를 입력받는다
4) 입력받은 size 만큼의 배열 moves를 입력받는다.

<나의 풀이>
- 일단 바구니는 선입후출이니까 스택
- board에서 라인 따질 때 -1 해야 함. 1번이면 0번 컬럼에 가야 된다는 얘기.
- moves for문 돌리면서 board[+][1] 이렇게 주면 열은 그대로고 행만 계속 ++될 텐데
- 거기서 찾아낸 값이 0이 아니면 가져와서 스택에 쌓고(push) 기존에 있던 자리는 0으로 대체.
- 이걸 반복하는데 만약 스택에 넣으려고 할 때 peek랑 값이 같으면 push 안 하고 pop 하고 count

터지는 횟수가 아니라 사라진 인형 갯수 count라 count++가 아니라 count +=2 이거였어.
-> 여기서 헤맸는데 이거가 아니었으면 문제 읽고 푸는 건 30분 내외 정도 걸린듯

*/