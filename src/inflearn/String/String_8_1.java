package inflearn.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class String_8_1 {
    public String solution(String inputString) {
        inputString = inputString.toUpperCase();

        ArrayList<Character> inputCharList = new ArrayList<>();
        ArrayList<Character> alphabeticList = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            inputCharList.add(inputString.charAt(i));
        }

        for (Character element : inputCharList) {
            if (Character.isAlphabetic(element)) {
                alphabeticList.add(element);
            }
        }
        ArrayList<Character> reverseList = new ArrayList<>(alphabeticList);
        Collections.reverse(reverseList);

        if (alphabeticList.equals(reverseList)) {
            return "YES";
        } else return "NO";
    }

    public static void main(String[] args) {
        String_8_1 problem = new String_8_1();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        String answer = problem.solution(inputString);


        System.out.println(answer);
    }
}

/*
    Collections.emptyList() <- ?
    Collections에서 제공하는 함수들에 대한 공부가 따로 필요할듯

 */