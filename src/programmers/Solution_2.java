package programmers;

class Solution_2 {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.split(" ");

        for (String element : sp) {
            if (element.length() == 0) answer += " ";
            else {
                answer += element.substring(0, 1).toUpperCase();
                answer += element.substring(1).toLowerCase();
                answer += " ";
            }
        }

        if (s.endsWith(" ")) return answer;
        return answer.substring(0, answer.length() - 1);
    }

    public static void main(String[] args) {
        Solution_2 T = new Solution_2();
        System.out.println(T.solution(" 3people unFollowed me "));
    }
}



/*

이게 생각보다 함정이 많은 문제였음.
대소문자 변환한 문자들을 더하는 과정에서 마지막에 " "가 추가되는 경우는 answer.substring(0, answer.length() - 1) 이렇게 걸러서 출력을 해주었고
원래 주어진 문자열 자체가 마지막에 공백을 포함하고 있는 경우에는 그냥 그대로 출력을 해주었음.

원래 split할 때 마지막 공백을 포함하려면 두번째 인자에 -1을 붙여줘야 하는데 여기는 그러지 않아서 무시가 됐지만
결과적으로 문자열을 합칠 때 무시해줬던 " "를 다시 만들어준 셈이니 똑같아서 넘어가는 상황.

split은 -1을 안 붙이면 맨 앞에 오는 공백만 포함시키고 마지막은 무시한다.

원본 문자열 마지막이 어떻게 끝나는지 확인할 수 있는 메서드로 endsWith()를 활용했다.

+)
substring할 때 끝나는 지점을 안 정해주면 시작 지점부터 끝까지를 꺼내준다.
trim() 메서드는 문자열의 시작과 끝에 포함되는 공백을 제거해준다.

배열 -> length
ex) int length = arr.length;

문자열 -> length()
ex) int length = str.length();

List, Set 등 -> size()


배열과 List는 다른 자료구조입니다.
배열은 고정된 크기를 가지고 있으며, 한 번 생성하면 크기를 변경할 수 없습니다. 그러나 인덱스를 통해 빠른 접근이 가능합니다.
List는 크기를 동적으로 조정할 수 있으며, ArrayList나 LinkedList와 같은 구현체를 사용하면 추가, 삭제 등의 작업이 쉽습니다.
인덱스를 통해 접근할 수 있기 때문에 배열과 유사한 방식으로 사용할 수 있습니다.
배열은 기본형 타입과 객체 타입 모두를 담을 수 있습니다. 반면에 List는 객체 타입만을 담을 수 있습니다.

 */