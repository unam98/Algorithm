package programmers;//for문 돌려서 contain 여부를 직접 확인해도 되는데 편의상 입력받은 배열을 각각 Arrays.asList()을 써서 ArrayList로 만들고
//contains로 A에 속하는지, B에 속하는지 체크
//만약 A에 속한다면 queue_A에 peek()랑 대조해서 일치하면 queue에서 poll() 아니면 냅둬
//이런식으로 goal 배열을 다 돌렸을 때 2개의 큐가 모두 empty면 Yes, 아니면 No
import java.util.*;

class Solution_6 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        ArrayList<String> al_cards1 = new ArrayList<>(Arrays.asList(cards1));
        ArrayList<String> al_cards2 = new ArrayList<>(Arrays.asList(cards2));
        
        Queue<String> q_cards1 = new LinkedList<String>(al_cards1);
        Queue<String> q_cards2 = new LinkedList<String>(al_cards2);
        
        Integer count = goal.length;
        
        for(String element : goal){
            if(al_cards1.contains(element)){
                if(q_cards1.peek().equals(element)){
                    q_cards1.poll();
                    count--;
                }
            } else if(al_cards2.contains(element)){
                if(q_cards2.peek().equals(element)){
                    q_cards2.poll();
                    count--;
                }
            }
        } //for문 종료
        
        if(count == 0){
            return "Yes";
        } else return "No";
    }
}

/*
카드 뭉치
---
처음 생각한 logic은
goal 배열에 for문 돌려서 각각의 element들이 cards1에 포함되는지, cards2에 포함되는지 판단 후
가령 cards1이라고 하면 cards1 요소를 담은 큐의 맨앞(peek)과 비교해서 일치하면 poll 해주고
이렇게 배열의 끝까지 for문을 돌리고나서 큐에 아무것도 남아있지 않으면 순서에 맞게 다 poll 됐다는 뜻이니 Yes를 return 하게 하는 거였음.
그런데 예외 처리 하나 못해서 일부 테스트 케이스 통과 못했음.

*제한 사항
2 ≤ goal의 길이 ≤ cards1의 길이 + cards2의 길이

cards1과 cards2로 주어지는 배열 요소가 goal에 포함이 안 돼있을 수 있다는 걸 놓쳤음.

즉, goal을 완성했는데 큐에 사용 여부에 관계 없이 element가 남아 있을 수 있다는 거여서
기존에 짜놨던 조건문을 성립이 안 되는 상황 ( q_cards1.size() == 0 && q_cards2.size() == 0 )
그래서 goal.length 만큼의 Integer 변수를 하나 선언하고 poll() 될 때마다 count--를 했음.
count가 0이라는 건 q가 남아있든 아니든 일단 순서에 맞게 element들을 다 쓰긴 썼다는 거니까 Yes
---
다른 사람들의 풀이를 보니 큐를 쓴 사람도 있고 안 쓴 사람들도 있는데 쓴 사람들이 더 많은 것 같고
나는 이런 유형을 한 번 풀어본 적이 있어서 풀이를 바로 떠올릴 수 있었음.

아쉬웠던 건 예외 케이스를 스스로 못찾아낸 것.

다양한 유형의 알고리즘을 풀면서 내가 선택할 수 있는 툴의 범위를 넓히는 것의 중요성/필요성을 체감함.
*/