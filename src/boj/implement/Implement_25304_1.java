package boj.implement;

import java.util.*;
import java.io.*;

public class Implement_25304_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Integer total = Integer.parseInt(bf.readLine());
        Integer N = Integer.parseInt(bf.readLine());
        Integer sum = 0;

        for(int i=0; i<N; i++){
            String[] sp = bf.readLine().split(" ");
            sum += Integer.parseInt(sp[0]) * Integer.parseInt(sp[1]);
        }

        if(total.equals(sum)){
            System.out.println("Yes");
        } else System.out.println("No");
    }
}

/*
 */