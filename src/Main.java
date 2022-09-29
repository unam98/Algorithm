import java.util.Scanner;

public class Main {
    int howMany = 0;

    int solution(String inputString, char wantToCheck) {
        char[] stringList = inputString.toUpperCase().toCharArray();
        char upperWantToCheck = Character.toUpperCase(wantToCheck);

        for (char x : stringList) {
            if (x == upperWantToCheck) {
                howMany++;
            }
        }
        ;

        return howMany;
    }

    ;


    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        char wantToCheck = in.next().charAt(0);

        int answer = main.solution(inputString, wantToCheck);
        System.out.println(answer);

    }


}









