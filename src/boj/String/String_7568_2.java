package boj.String;

import java.util.*;
import java.io.*;

public class String_7568_2{
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Integer N = Integer.parseInt(bf.readLine());
        Integer[][] array = new Integer[N][2];

        for(int i=0; i<N; i++){
            String inputStr = bf.readLine();
            String[] sp = inputStr.split(" ");
            for(int j=0; j<=1; j++){
                array[i][j] = Integer.parseInt(sp[j]);
            }
            // array[i][0] = Integer.parseInt(sp[0]);
            // array[i][1] = Integer.parseInt(sp[1]);

        } //2차원 배열 생성 완료

        String answer = "";

        for(int i=0; i<N; i++){
            Integer rank = 1;
            for(int j=0; j<N; j++){
                if((array[i][0] < array[j][0]) && (array[i][1] < array[j][1])){
                    rank++;
                }//if문
            }//inner for문
            answer += rank + " ";
        } //outer for문

        System.out.println(answer.trim());

    }//main
}//Main

/*
하나가 기준이 돼서 그 다음 인덱스들 하고 비교가 되는 거니까
자연스레 i+1과의 비교가 되게 코드를 짰는데 이게 잘못이었음
i가 ++돼서 1행,2행 등부터 시작된다고 해도 이전 행하고도 비교가 이루어질 수 있는 건데
i+1 이런식으로 logic을 짜면 이전 행하고의 비교가 이루어질 수 없음.

또 내가 인덱스 1까지 있는 배열을 만들고 싶으면 [2] 이렇게 해야 한다는 걸 깜빡했음.

2차원 배열 만들 때 나는 2중 for문을 썼는데 결과는 똑같지만
어차피 열은 2개밖에 안 되는데 그냥 바로 넣어주는 게 깔끔했을 것 같음.

String 객체는 불변이라 지금 내 방법처럼 answer += 를 하면 매번 객체가 새로 생성되고 기존의 객체는 GC가 처리해준다고 함.
하지만 이러한 작업이 많아지면 어쨌거나 비효율적이긴 하니 mutable한 특성을 갖고 있는 StringBuilder를 사용한다고 함.
실제로 StringBuilder를 쓰니 속도가 더 빨라졌음.
그런데 어떤 문제들은 가끔 맨 끝의 공백 처리도 필요한데 이 문제는 맨 끝 공백 처리를 안 해도 정답으로 인정해줘서 다행이지
만약 공백 처리를 해야 하는 상황이라면 그냥 answer +=를 쓰는 게 간편한듯.
 */