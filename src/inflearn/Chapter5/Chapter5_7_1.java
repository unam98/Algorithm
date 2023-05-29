package inflearn.Chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chapter5_7_1 {
    public String solution(String essential, String lectures) {

        Queue<Character> Q = new LinkedList<>();

        for (Character element : essential.toCharArray()) {
            Q.add(element);
        }
        System.out.println("필수과목 Q는 다음과 같습니다 " + Q);

        for (Character lecture : lectures.toCharArray()) {
            if (lecture.equals(Q.peek())) {
                System.out.println("현재 Q의 head는 다음과 같습니다 " + Q.peek());
                Q.remove();
                System.out.println("현재 Q는 다음과 같습니다 " + Q);
            }
        }

        if (Q.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String essential = sc.next();
        String lectures = sc.next();

        Chapter5_7_1 T = new Chapter5_7_1();
        String answer = T.solution(essential, lectures);
        System.out.println(answer);
    }
}

/*

8시 13분

input
1- 필수과목순서
2- 현수가짠시간표

return
String "YES", "NO"

8시 21분 input까진 다 만들었고 설계도 끝냈고 이제부터 구현 들어감

순서가 중요하니까 큐 만들어서 C-B-A 넣고
시간표 for문 돌리면서 큐 맨 앞에 있는 거 만나면 head 조회
for문 다 돌았을 때 큐가 비어져있으면 YES
만약 B가 나왔는데 큐 head에 있는 게 C면 바로 NO

8:30 fail
8:35 성공

맨 앞에 있는 값을 조회만 하려고 했는데 조회와 동시에 삭제를 해버리는 poll을 사용해서 문제가 됐음.
큐나 스택이나 똑같이 peek()로 head 값을 조회할 수 있음.
*/