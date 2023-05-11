package boj.implement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Implement_1316 {
    public Integer solution(ArrayList<ArrayList<Character>> charListOutside) {

        Map<Character, Integer> map;
        Integer count = 0;

        for (ArrayList<Character> element : charListOutside) {
            map = new HashMap<>();
            for (int i = 0; i < element.size(); i++) {
                map.put(element.get(i), 0);
            }
            boolean tmp = true;

            for (int i = 0; i < element.size(); i++) {

                if (map.get(element.get(i)) == 1) {
                    if (element.get(i) != element.get(i - 1)) {
                        tmp = false;
                        break;
                    }
                } else {
                    map.replace(element.get(i), 0, 1);
                    System.out.println(map);
                }
            }
            if(tmp) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Implement_1316 pr = new Implement_1316();

        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();

        ArrayList<ArrayList<Character>> charListOutside = new ArrayList<>();
        ArrayList<Character> charListInside;

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            charListInside = new ArrayList<>();
            for (int j = 0; j < word.length(); j++) {
                charListInside.add(word.charAt(j));
            }
            charListOutside.add(charListInside);
        }
        System.out.println(charListOutside);
        Integer answer = pr.solution(charListOutside);
        System.out.println(answer);
    }
}

/*
1) 사용했다고 해서 바로 break 거는 게 아닌데 걸어버렸음.
처음 설계부터 잘못됐다는 것.

2) 조건이 여러개라면 그것들간의 포함관계를 잘 따져야 되는데 이걸 잘 못했음
사용 여부를 먼저 체크하고 연속 여부 체크했어야 했는데
나는 연속 여부를 먼저 체크하고 사용 여부를 체크했어.
-> 사용했는데 또 나오면 죽는 거잖아. 그럼 사용 여부 확인이 먼저 이루어졌어야지. 이걸 처음에 알고 시작했는데도 정작 구현할 때 반대로 했음.

사용 여부가 true라면 이미 인덱스 i=0은 아닌 상황인데 이걸 바깥에 첫째 조건으로 안 두고 안 쪽에 두니까
나는 i-1할 때 인덱스 에러 뜰 걸 고려해서 0번째 인덱스 값을 미리 할당하게 됐음.

3) 그동안 i+1하고만 비교하는 방법을 생각했었는데 i-1하고 비교하는 방법도 있었음.

4) 나는 Map을 통해서 사용 여부를 check했는데 다른 사람들은 일반 배열에 인덱스를 활용해서 확인해주었음.
'그 문자'가 중요한 상황에서 원본 String은 변하지 않으니까 그 문자의 특정 인덱스의 boolean을 확인하는 게 곧 그 문자의 사용 여부를 확인할 수 있는 것.

5) count를 어떻게 할지가 고민이었음
그동안 나는 특정 조건이 충족되면 ++을 하는 식이었는데
++를 기본값으로 두고 특정 조건이 불충족 됐을 때 ++가 안 일어나게 하는 관점도 있었음.

6) 다른 사람들보다 메모리 사용이 너무 큼.

7) List in List로 안 했어도 됐을 듯
이 방법이 필수적이지 않은 상황에서 은근 시간 소모를 많이 함.
그냥 입력 받자마자 logic 돌리는 식으로 했으면 빨랐을 듯.

 */