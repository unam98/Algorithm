package practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String_practice_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // 개행 문자를 읽어내는 코드 추가
        String[] token = new String[N];

        for(int i = 0 ; i < N ; i++){
            String input = sc.nextLine();
            StringTokenizer st = new StringTokenizer(input,"enqueue ");
            token[i] = st.nextToken();
        }

        for(String element : token){
            System.out.println(element);
        }

    }
}

/*
입력값에서 내가 원하는 값만 추출해내는 연습을 하고 있는데
당장 생각해낸 방법 중 하나는 StringTokenizer를 활용하는 것.

새로 알게된 건, nextInt()는 enter 치기 전까지만 입력으로 받는데
enter 치고 nextLine()으로 새 입력을 연달아 받으면
nextLine()이 그 enter를 인식해서 ""를 반환해서 이후 입력들이 의도대로 잘 안 받아진다는 이슈가 있었음.
이를 해결하려면 nextInt() 다음에 개행 문자 소비 목적의 nextLine()를 하나 삽입해서 처리하는 것

https://gongstudyit.tistory.com/18
 */