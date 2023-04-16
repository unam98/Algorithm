package inflearn.Array;

import java.util.*;

public class Array_8_1 {
    public String solution(ArrayList<Integer> listA) {

        ArrayList<Integer> sortedListA = new ArrayList<>(listA);
        sortedListA.sort(Collections.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : listA) {
            int index = sortedListA.indexOf(element) + 1;
            map.put(element, index);
        }

        String answerString = "";

        for (int element : listA) {
            answerString += map.get(element) + " ";
        }

        return answerString;
    }


    public static void main(String[] args) {
        Array_8_1 problem = new Array_8_1();

        Scanner in = new Scanner(System.in);

        int N_length = in.nextInt();

        ArrayList<Integer> listA = new ArrayList<>();

        for (int i = 0; i < N_length; i++) {
            int data = in.nextInt();
            listA.add(data);
        }
        String answer = problem.solution(listA);
        System.out.println(answer);
    }
}


/*
    <나의 풀이 logic>
    82, 82, 90이 있으면
    1, 1, 3으로 rank 계산을 해주어야 하는 게 관건이었다.
    나는 hashMap과 indexOf() 함수를 활용했고 이게 핵심이었다.
    list를 내림차순으로 정렬한 후 indexOf()를 쓰면
    같은 숫자가 있어도 최초 발견되는 index만 반환되고 뒤에 남아있는 숫자들에 대한 index는 당겨진다거나 하는 거 없이 그대로 유지가 돼서
    가령 82. 82, 90이 있을 때 82의 rank는 0이고 90은 rank가 2가 나올 수 있게 했다.
    이때 인덱스는 0부터 시작되므로 rank를 계산할 때 +1을 해주어 보정을 해주었다.
 */