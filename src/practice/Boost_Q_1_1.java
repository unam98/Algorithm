package practice;

import java.util.*;

public class Boost_Q_1_1 {

    public static ArrayList<Integer> solution(Integer[] inputArray){
        ArrayList<Integer> answer = new ArrayList<>();

        Integer[] countNumArray = new Integer[101];
        Arrays.fill(countNumArray,0);

        for(Integer number : inputArray){ //주어진 배열의 요소에 해당하는 인덱스 번호에 ++;
            countNumArray[number] += 1;
        } //count는 완료


        for(Integer count : countNumArray){
            if(count > 1){
                answer.add(count);
            }
        }

        if(answer.isEmpty()){
            answer.add(-1);
        }

        return answer;
    }

    public static void main(String[] args) {

        Integer[] sample = {3,5,7,9,1};
        System.out.println(solution(sample));

    }
}

/*
5:00
자연수가 들어있는 배열이 주어지면
그 안에서 중복으로 출현하는 숫자들 count 해서 배열로 return
가령 [2,3,3,2,5,5] 이렇게 주어지면
빠른 숫자인 2는 2개 3은 2개 5는 5개니까 [2,2,2] return
만약 중복되는 게 없으면 -1 return

배열 원소는 1이상 100이하
배열 길이 1이상 100이하
그러면 size 101짜리(인덱스 최대값 100) 배열 하나 민들고 기본값 0
for문 돌리는데 만약 inputArray 안에 들어있는 요소랑 100짜리 배열의 인덱스 번호한 거랑 같으면
해당 인덱스 번호에 count++;
지금 중복인 게 몇개가 나올지는 모르는 거니까 return할 배열의 사이즈가 가변적인 거고 이는 ArrayList를 만들어서 관리.
100짜리 배열 for문 돌리면서 저장된 값이 1이상이면 그거 순서대로 ArrayList에 add하고 이를 배열로 return.

ArrayList 사이즈랑 똑같은 배열 만들고 for문 돌리면서 하나씩 넣으면 되긴 함. 근데 지금은 편의상 그냥 ArrayList를 return 하려고 함.
5:30
 */