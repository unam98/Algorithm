package inflearn.Chapter7;

public class Chapter7_1_1 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public void solution(int n) {
        DFS(n);
    }

    public static void main(String[] args) {
        Chapter7_1_1 T = new Chapter7_1_1();
        T.solution(3);
        //System.out.println(T.solution(3));
    }
}