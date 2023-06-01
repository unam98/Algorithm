package boj.String;

import java.util.Scanner;

public class String_1152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        input = input.trim();
        String[] splitList = input.split(" ");

        if(splitList[0].equals("")){
            System.out.println(0);
        } else {
            int answer = splitList.length;
            System.out.println(answer);
        }
    }
}

/*
The first character is a blank -> 6
 The first character is a blank -> 7
  The first character is a blank  -> 8

split 함수를 쓸 때 맨앞에는 구분자 분리 적용이 안 된다.
반면 맨 마지막은 구분자가 있어도 포함 안 된다. 포함하고 싶으면
parameter로 -1을 추가해야 한다.

이 문제의 경우 맨앞 공백을 count하지 않는 게 포인트였는데
charAt과 if문을 걸어서 -1을 해줄 수도 있지만
나는 trim()으로 맨앞뒤 공백을 제거해주고 시작했음

+) 아무것도 입력하지 않고 enter 했을 때 배열 길이가 1로 나오는 게 함정이었음
 */