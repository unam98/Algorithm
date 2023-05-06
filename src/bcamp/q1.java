package bcamp;

import java.util.*;

public class q1 {

    public ArrayList<Integer> solution(ArrayList<Integer> givenArray) {
        System.out.println("givenArray : " + givenArray);
        Set<Integer> set = new HashSet<>(givenArray);
        System.out.println("set : " + set);

        ArrayList<Integer> setArray = new ArrayList<>(set);
        Collections.sort(setArray);
        System.out.println("setArray : " +setArray);


        Integer count = 0;
        ArrayList<Integer> answer = new ArrayList<>();

        for (Integer element : setArray) {
            for (int i = 0; i < givenArray.size(); i++) {
                if (givenArray.get(i).equals(element)) {
                    count++;
                }
            }
            if (count != 1) {
                answer.add(count);
            }
            count = 0;
        }

        if (answer.isEmpty()) {
            answer.add(-1);
        }
        return answer;
    }


    public static void main(String[] args) {
        q1 T = new q1();

        ArrayList<Integer> givenArray = new ArrayList<>(List.of(3,2,4,4,2,5,2,5,5));
        ArrayList<Integer> answer = T.solution(givenArray);

        System.out.println(answer);

    }
}

/*
배열이 주어지고 중복되는 요소가 몇개인지 리스트 형태로 반환
중복되는 숫자가 없으면 -1 반환
ex)
arr = [1,2,3,3,3,3,4,4]가 주어지면 1,2는 중복이 없으니 제외하고 3은 4, 4는 2개니까 [4,2]

arr = [3,2,4,4,2,5,2,5,5]면 2는 3, 4는 2, 5는 3회이므로 [3,2,3] 반환

givenArray가 set으로 바꾸니 오름차순으로 정렬되어 나오길래 자동으로 지원해주는 기능인 줄 알았는데
우연의 일치이지 set은 순서 개념이 없다고 함. 이렇게 임의로 순서가 정렬되어 나오는 걸 막고 싶으면 Set을 생성할 때 타입을 LinkedHashSet을 쓰면 됨.

이 문제에서는 오름차순 정렬이 필요하므로 엄밀하게는 13번 line에
Collections.sort(setArray);를 추가해줘야 맞는 풀이가 됨.

답은 맞췄는데 시간 복잡도 때문에 이중 for문이 마음에 걸림.
프로그래머스에서도 풀어봐야 함.

 */