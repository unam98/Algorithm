package boj.String;

import java.util.*;

public class String_10809_1 {
    public String solution(String inputStr) {
        String answer = "";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char element : inputStr.toCharArray()){
            if(!map.containsKey(element)){
                map.put(element,inputStr.indexOf(element));
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if(map.containsKey(c)){
                answer += map.get(c) + " ";
            } else {
                answer += "-1" + " ";
            }
        }

        return answer.trim();
    }

    public static void main(String[] args) {
        String_10809_1 pr = new String_10809_1();

        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();

        String answer = pr.solution(inputStr);
        System.out.println(answer);
    }
}

/*
<문제>
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

<입출력 예시>
baekjoon
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1

입력받은 문자열을 toCharArray로 분리한다음
for문 돌리면서 hashMap을 만들 건데
앞에서부터 element와 그 index를 각각 hashMap의 key, value 값으로 저장해놓는데
이미 hashMap에 값이 저장돼있는 key값이라면 skip

이렇게 for문 다 돌리면 hashMap이 완성되고
내가 a..z까지 for문을 돌리는데
return은 String이니까 answer = ""하나 두고
만약 hashMap에서 조회가 되면 저장된 value 값을 answer += value + " ";이렇게 추가
조회가 안 되면 1-을 추가.

이때 마지막엔 공백이 없어야 하므로 return 전에 trim()으로 맨앞뒤 공백 제거


+)
trim()은 String 클래스에서만 제공하는 메서드
String 객체의 인덱스에 접근할 때는 .indexOf()

다른 사람들은 길이 26짜리 list를 하나 만들고
그 list element들의 초기값을 -1로 설정해주고
charAt()으로 처음 입력받은 문자열 각각이 -1 (처음 등장)하는 거면 그 자리에 새 인덱스를 갱신해주는 식으로 코드를 짰음.
만약 재등장하거나 아예 입력받은 문자열에 포함된 char이 아닐 경우 그대로 skip이 되게했음.

 */