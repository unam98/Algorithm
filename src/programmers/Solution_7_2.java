package programmers;

class Solution_7_2 {
    public int[] solution(String[] wallpaper) {
        Integer rowLength = wallpaper.length;
        Integer columnLength = wallpaper[0].length();

        Integer x_min = Integer.MAX_VALUE;
        Integer y_min = Integer.MAX_VALUE;
        Integer x_max = Integer.MIN_VALUE;
        Integer y_max = Integer.MIN_VALUE;

        for(int i=0; i<rowLength; i++){
            for(int j=0; j<columnLength; j++){
                if(wallpaper[i].charAt(j) == '#'){
                    x_min = Math.min(x_min,i);
                    x_max = Math.max(x_max,i);
                    y_min = Math.min(y_min,j);
                    y_max = Math.max(y_max,j);
                }
            }
        }

        int[] answer = {x_min,y_min,x_max+1,y_max+1};
        return answer;
    }
}

/*
왜 다른 사람들의 풀이랑 크게 다를 게 없어보이는데 나는 결과값이 다르게 나오는지를 알았음.

최소/최대 갱신 목적을 위해 작성한 if문들을 각각 독립적으로 두지 않고 else if로 엮어서 그런 거였음
i가 4일 경우 내가 초기값으로 설정해놓은 50보다 작으니 true가 되고 따라서 else if까지 안 넘어감.
그래서 x_max를 갱신해야 하는데 갱신이 안 되는 거였음.

이번에 느낀 건, 이런 이슈를 방지하기 위해선 최대/최소 구할 땐 가급적이면 Math.min(), Math.max()를 쓰자는 것이고
무지성 이차원 배열 생성을 지양하자는 것. 어차피 이중 for문 돌리는 거면 똑같기 때문에.

이 문제의 핵심은 패턴을 찾아내는 것, 머리로 굴리는 것보다 a[4][2] 이런식으로 직접 눈으로 보니까 찾아내기 더 쉬웠음.
패턴을 찾을 땐 코드를 짜는 입장에서 보려고 시도하면 좋을듯.
*/