package boj.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Implement_2438_1 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Integer N = Integer.parseInt(bf.readLine());

        for(int i = 1; i<=N; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

/*
 */