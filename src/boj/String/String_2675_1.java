package boj.String;

import java.util.*;

public class String_2675_1 {

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

    public static void main(String[] args) {
        String_2675_1 pr = new String_2675_1();
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        sc.nextLine();

        ArrayList<String> inputStrList = new ArrayList<>();

        for(int i = 0 ; i < N ; i++){
            String inputStr = sc.nextLine();
            inputStrList.add(inputStr);
        }

        ArrayList<String> answer = pr.solution(inputStrList);

        for(String element : answer){
            System.out.println(element);
        }
    }
}

/*
출력 형식이 String인데 실수로 list 그대로 출력해버렸음.

ArrayList로 list를 생성한 경우 그 list를 print하면 내부 요소들이 한 번에 출력되는데
char[] 이런식으로 선언하고 print하면 주소값이 출력됨.

split 함수의 return이 String[]인지 char[]인지 헷갈렸는데 String[]라는 걸 확인했음.

어떤 경우엔 리스트를 ArrayList로 만들고 어떤 경우엔 char[] 이렇게 만들어주었는데
for문 돌리다가 index 에러가 떴는데 대응하기 번거로웠음.
메모리 제한이 없는 경우라면 보통은 그냥 ArrayList를 쓰는 게 편리할 듯함.

ArrayList의 경우 요소에 get()으로 접근하고
char[] 이런식으로 생성한 경우 [i] 이렇게 인덱스로 직접 접근을 해야 하는데
문자열은 charAt(i) 이렇게 접근했어야 했는데 까먹고 문자열도 [i] 이렇게 바로 접근해주려고 했었음.

맞추긴 했는데 나랑 시간이 비슷한 사람들은 코드 길이가 훨씬 짧고
코드 길이가 비슷하면 나보다 시간이 빠름.

 */