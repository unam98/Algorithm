package programmers;

class Solution_3 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (s.length() > 1) {

            int cntOne = 0;
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '0') answer[1]++;
                else cntOne++;
            }

            s = Integer.toBinaryString(cntOne);
            answer[0]++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_3 T = new Solution_3();
        int[] answer = T.solution("01110");
    }
}





/*

Integer.toBinaryString() 이걸 아느냐 모르냐에 따라 구현 난이도가 확 달라짐.
나는 저걸 몰랐기 때문에 접근 방법도 달라질 수밖에 없었음.
저걸 알았다면 그냥 단순히 이진변환을 하기 위해 1의 갯수를 카운트 하려고만 했을 텐데
몰랐다보니 0을 제거한 리스트를 직접 구하고 그걸 다른 함수의 인자로 넣어서 이진 변환을 하려고 함.
이러다보니 '0을 제거하는 방법' 등에 대한 고민이 이어졌음. Integer.toBinaryString()를 알았다면
할 필요 없는 고민이었는데.

 */