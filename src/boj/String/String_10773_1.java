package boj.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class String_10773_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer K = Integer.parseInt(bf.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            //값 입력받고 0이 아니면 stack에 push, 0이면 안 넣고 pop
            Integer value = Integer.parseInt(bf.readLine());
            if (!value.equals(0)) {
                stack.push(value);
            } else {
                stack.pop();
            } //else문 close
        } //for문 close

        int sum = 0;
        while (!stack.isEmpty()) {
            int value = stack.pop();  // 스택에서 값 제거하고 가져오기
            sum += value;
        }

        System.out.println(sum);


        //스택에 있는 거 총합 구해야 함.
    } //main 함수 close
}
/*
2:36~2:49
첫번쨰줄에 K를 입력받으면 이후 그만큼 수를 입력받는데
0이면 가장 최근에 입력받은 수를 지우고
최종적으로 남이있는 수의 합을 출력하는 것
00 이면 2개 지우는 것
-> 스택

그냥 딱 보자마자 스택으로 풀어야겠다는 생각이 들었고 어렵지 않았음
스택에 들어있는 값들의 sum을 구하는 게 조금 어색했음.

equals 메서드가 어느 특정 클래스에서만 제공되는 것인지 헷갈렸는데
String에서도 제공되고 Integer에서도 제공되는 것임을 확인했음.
 */

