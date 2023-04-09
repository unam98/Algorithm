package inflearn.String;

import java.util.*;
class String_11_2 {
    public String solution(String s){
        String answer="";
        s=s+" ";
        int cnt=1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) cnt++;
            else{
                answer+=s.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        String_11_2 T = new String_11_2();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}

/*

이전에 작성했던 코드는 인덱스 범위 에러 때문에 여러 if문을 써서 예외 처리를 해줘야 했는데
이 코드는 처음에 s=s+""; 이렇게 빈문자열로 인덱스를 하나 늘려줌으로써 맨 마지막 요소의 연속 여부를 처리할 수 있게 해줬음.
이거 하나로 인해 코드가 엄청 간결해질 수 있음.
처음 input으로 받은 걸 건드린다는 생각은 못했었는데 어찌됐든 결과만 낼 수 있으면 상관이 없겠군.

 */

