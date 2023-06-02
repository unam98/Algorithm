package boj.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class String_2675_2 {

    public ArrayList<String> solution(ArrayList<String> inputStrList){

        ArrayList<String> answer = new ArrayList<>();

        for(String element : inputStrList){
            String[] splitList = element.split(" ");
            Integer count = Integer.parseInt(splitList[0]);
            String str = splitList[1];
            String result = "";

            for(int i = 0 ; i < str.length(); i++){
                for(int j = 0; j < count; j++){
                    result += str.charAt(i);
                }
            }
            answer.add(result);
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        String_2675_2 pr = new String_2675_2();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        ArrayList<String> inputStrList = new ArrayList<>();

        for(int i = 0 ; i < N ; i++){
            String inputStr = bf.readLine();
            inputStrList.add(inputStr);
        }

        ArrayList<String> answer = pr.solution(inputStrList);

        for(String element : answer){
            System.out.println(element);
        }
    }
}

/*
똑같은 logic에 input만 Scanner가 아닌 BufferedReader로 바꿨는데
시간이 232ms -> 156ms으로 단축됐음.

Scanner는 1KB 크기의 버퍼를 갖기 때문에 입력과 동시에 전송이 되는데
입력받는 문자의 길이 길어지는 경우 비효율적이라고 한다.
입력을 받는 시점에서 타입을 구분하여 input을 받을 수 있다는 편리함은 있다.

BufferedReader는 8KB 크기의 버퍼를 갖기 때문에 모아뒀다가 전송하는 측면에서
Scanner보다 효율적인 경우가 있다. 하지만 String으로밖에 입력을 못받기 때문에
입력을 받고나서 별도의 가공 작업이 필요하다는 번거로움이 있다.

https://lasbe.tistory.com/48
 */