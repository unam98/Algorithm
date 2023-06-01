package boj.String;

import java.util.Scanner;

public class String_11719_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String input = sc.nextLine();
            System.out.println(input);
        }
        sc.close();
    }
}

/*
공백을 포함해서 읽어들여야하기 때문에 nextLine()을 써주었고
포인트는 입력이 더이상 없을 때까지 매번 출력을 해내야 된다는 것이었는데
이것을 while문과 hasNextLine() 메서드로 처리했음
 */