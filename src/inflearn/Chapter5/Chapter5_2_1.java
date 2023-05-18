package inflearn.Chapter5;

import java.util.Scanner;
import java.util.Stack;

public class Chapter5_2_1 {
    public String solution(String inputStr) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char element : inputStr.toCharArray()) {
            if (!Character.isAlphabetic(element)) {
                if (element == '(') {
                    stack.push(element);
                }//if
                else if (element == ')') {
                    stack.pop();
                }//else if
            }//if
            else {
                if (stack.isEmpty()) {
                    answer += element;
                }
            }
        } //for
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();

        Chapter5_2_1 T = new Chapter5_2_1();
        String answer = T.solution(inputStr);
        System.out.println(answer);
    }
}

/*
중괄호가 많아질 때는 //로 닫는지점을 표시해주는 게 알고리즘 풀 때 안 헷갈리고 좋은 듯.
IDE에서 코드 짤 땐 괄호 안 맞으면 빨간줄 떠서 바로 알 수 있는데
코테 플랫폼에서는 그게 안 돼서 파악이 바로 안 됨.
그래서 저번에 return 위치를 잘못 달아줘서 컴파일 에서 떴었음.

다른 풀이에서는 스택에 일단 )가 아니면 다 push한다음 )가 뜨면
while(stack.pop()!='(');으로 stack에 있는 걸 다 pop한다음
stack에는 소괄호에 포함 안 되는 알파벳만 남긴다음 그걸 for문 돌리면서
answer += stack.get(i);으로 처리해주었음.

나는 (가 뜬 순간부터 그게 닫히기 전까지의 것들은 의미가 없는 것들이니까
그냥 (만 push하고 )가 뜨면 pop해줬음. 이러면 stack이 비어있다는 건
소괄호에 속해지는 영역이 아니라는 거니까 바로 answer에 += 해줬음.
)가 (없이 먼저 나올 수 없기 때문에 가능한 풀이었음.

*/