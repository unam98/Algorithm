package programmers;

class Solution_5 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for(int i=0; i<targets.length; i++){
            Integer sum = 0;
            for(int j=0; j<targets[i].length(); j++){
                Integer result = countMinKey(targets[i].charAt(j), keymap);
                if (result == -1) { // keymap에서 targets[i].charAt(j)를 찾을 수 없으면 -1을 return
                    sum = -1; // 목표 문자열을 작성할 수 없으므로 sum에 -1 저장
                    break;
                }
                sum += result;
            } //targets 한 요소에 대해 count가 끝난 상황
            answer[i] = sum;
        }
        return answer;
    }

    public Integer countMinKey(Character key, String[] keymap){
        Integer MIN = 101;

        for(String element : keymap){
            Integer keyCount = 0;
            for(int i=0; i<element.length(); i++){
                if(element.charAt(i) == key){
                    keyCount++;
                    if(keyCount < MIN){
                        MIN = keyCount; //1번 키든 2번 키든 더 최소 횟수를 발견하면 그걸로 갱신
                    }
                    break;
                } else {
                    keyCount++;
                }
            }
        }
        if(MIN == 101){ //MIN이 갱신 안 됐다는 건 한 번도 발견이 안 된 거니까 주어진 keymap 안에 없다는 것
            return -1;
        } else {
            return MIN;
        }
    }
}


/*
대충 만든 자판
---
함수를 쪼개보려고 함.
targets String 요소의 특정 char이 keymap에서 몇번 keyCount가 돼야 하는지 -1
이 함수가 만들어지면 targets의 한 요소 내 모든 char에 대해 for문 돌리면서 저 함수에 넣으면
1-2-2-1 이렇게 값이 뜰 거고 이걸 그대로 받아서 sum에 누적시키면 됨.
1을 더 구체화 시켜보자면, focous가 keymap으로 가야 됨.
특정 char을 입력받았을 때 그 값을 최소만큼 돌려서 얻어내려면 어떻게 해야 하는가?
---
처음 생각한 logic이 맞았는데 이걸 코드로 구현하는 과정에서 이슈가 있었음.
코드를 한 번에 짜려니까 잘 안 보이고 바로바로 코드를 짜기 어려웠음.

그래서 전체적인 logic을 세운다음 그거를 돌리기 위해 필요한 개념을 쪼개서 함수로 만들고
만들어준 함수를 호출하는 식으로 풀이를 짜니까 금방 짰음.

근데 아래의 반례를 고려 못했음.

keymap : ["BC"]
target : ["AC","BC"]
기댓값 : [-1,3]

그래서 예외를 추가해주었고

다른 사람들의 풀이를 보면서 추가로 참고할만한 건,
MIN 값의 초기값을 -1로 둔 것.

이러면 아래와 같은 코드 작성 필요 없이 바로 MIN을 return 하면 되니까.

if(MIN == 101){ //MIN이 갱신 안 됐다는 건 한 번도 발견이 안 된 거니까 주어진 keymap 안에 없다는 것
    return -1; }
 */