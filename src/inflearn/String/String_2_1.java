package inflearn.String;

import java.util.ArrayList;
import java.util.Scanner;

public class String_2_1 {
    public StringBuilder solution(String fullWord) {

        ArrayList<Character> charArrayList = new ArrayList();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < fullWord.length(); i++) {
            if (Character.isUpperCase(fullWord.charAt(i))) {
                Character element = Character.toLowerCase(fullWord.charAt(i));
                charArrayList.add(element);
            } else if (Character.isLowerCase(fullWord.charAt(i))) {
                Character element = Character.toUpperCase(fullWord.charAt(i));
                charArrayList.add(element);
            }
        }

        for (int i = 0; i < charArrayList.size(); i++) {
            builder.append(charArrayList.get(i));
        }
        return builder;

    }

    public static void main(String[] args) {
        String_2_1 problem = new String_2_1();
        Scanner input = new Scanner(System.in);
        String fullWord = input.next();


        StringBuilder answer = problem.solution(fullWord);
        System.out.println(answer);
    }
}

/*
String을 입력받고 바로 toCharArrayList를 썼으면 편한데 따로 emptyList를 만들고
직접 for문 돌려서 변환을 시켜주니까 코드도 길어지고 시간도 오래걸림
 */