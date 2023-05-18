package inflearn.Chapter5;

import java.util.Scanner;
import java.util.Stack;

public class Chapter5_1_1 {
    public String solution(String inputStr) {
        Stack<Character> stack = new Stack<>();

        int count = 0;

        for (char element : inputStr.toCharArray()) {
            if (element == '(') {
                stack.add(element);
                count++;
            } else if (element == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }

        if (count == inputStr.length() / 2) {
            return "YES";
        } else return "NO";
    }

    public static void main(String[] args) {
        Chapter5_1_1 T = new Chapter5_1_1();

        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();

        String answer = T.solution(inputStr);
        System.out.println(answer);
    }
}
/*
몇몇 테스트 케이스들에 대해서 Runtime Error가 계속 뜨길래 어떤 경우에 문제가 될까 고민을 해보면서 고쳐나갔음
*/