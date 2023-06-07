package boj.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_1213_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int[] alpha = new int[26];
        for (int i = 0; i < line.length(); i++) {
            int idx = line.charAt(i) - 'A';
            alpha[idx]++;
        }

        int isOne = 0;
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] % 2 != 0) isOne++;
        }

        String answer = "";
        StringBuilder sb = new StringBuilder();
        if (isOne > 1) answer += "I'm Sorry Hansoo";
        else {
            for (int i = 0; i < alpha.length; i++) {
                for (int r = 0; r < alpha[i] / 2; r++) {
                    sb.append((char) (i + 65));
                }
            }
            answer += sb.toString();
            String end = sb.reverse().toString();

            sb = new StringBuilder();
            for (int i = 0; i < alpha.length; i++) {
                if (alpha[i] % 2 == 1) {
                    sb.append((char) (i + 65));
                }
            }
            answer += sb.toString() + end;
        }
        System.out.println(answer);
    }

}
/*
팰린드롬

내가 푼 풀이는 아닌데 나랑 접근 방법이 달라서 가져옴

우선 패턴을 찾아내는 게 중요했음
팰린드롬이란 건 빈도가 홀수인 알파벳이 0개거나 1개여야만 가능함. 이건 맞췄는데
답에서 요구하는 형태로 알파벳들을 어떻게 쌓아나갈 건지가 챌린지였음.

전체적인 flow는 홀수 짝수 구분 없이 모든 char를 1/2해서 front를 만들고
홀수만 1/2해서 mid 만들고
front를 reverse해서 back 만든다음
front + mid + back 하면 되는 건데

나는 front를 만드는 과정에서 불필요하게 홀짝을 구분해주려고 했음.
홀수개 알파벳이 몇개를 가지고 있는지에 따라 최초 삽입되는 알파벳이 짝수인지 홀수인지가 갈린다고 생각을 했었음.
그런데 아니었고 그냥 mid를 만들 때만 홀수를 넣어주면 되는 거였음. 즉, 틀렸음.

이때 char별로 각각 몇번씩 나오는지를 count했어야 했는데 나는 hashMap을 써서 하려고 했음.
근데 이미 key로 들어가는 알파벳에 대해 빈도수가 value로 매칭이 돼있는데 여기서 홀/짝 유무를 어떻게 더 저장해주나 고민이었고
홀/짝만을 판별하는 함수를 따로 하나 만들까 생각했음.
이러면 map에 들어있는 key 값을 for문 돌리면서 front-mid-reverse를 만들 수는 있는데
문제에서 요구하는 알파벳순 정렬이 바로 안 된다는 문제가 생김.
그러면 정렬이 안 돼있는 front를 또 분해해서 아래의 과정이 추가돼야 함.
"입력된 문자열을 char 배열로 변환한 후 Arrays.sort() 메서드를 사용하여 배열을 정렬. 그리고 정렬된 배열을 다시 문자열로 변환"

어떻게든 구현은 해내겠지만 리소스가 너무 많이 듦.

반면 지금 가져온 풀이는 어차피 알파벳은 갯수가 정해져있으니 26 size 만큼의 배열을 만들고
아스키 코드를 활용해 for문 돌리면서 특정 인덱스에 출연하는 알파벳의 빈도수를 저장해주었음.
이로써 정렬 문제를 자연스럽게 해결함.

"그러면 나중에 알파벳 자체는 어떻게 추가해주는 거지?"라는 생각이 들었는데
정수(아스키 코드)를 char로 형변환해서 추가를 해주었음

---
직관적이지 못해서 아스키 코드를 잘 안 써왔는데
앞으로 이렇게 알파벳을 다루는 상황이 오면 하나의 옵션으로 생각해두면 좋을 듯.
이런 건 한정된 시간 안에서 중간에 수정을 하는 게 불가능에 가깝다고 봄.
풀면 풀고 못 풀면 못 푸는 거라 시간이 좀 걸리더라도 처음 설계를 확실히 하고 들어가야 할 듯.

-> int 형변환은 Integer.parseInt()였고
-> char로 형변환은 (char)

A -> 65
a -> 97

 */