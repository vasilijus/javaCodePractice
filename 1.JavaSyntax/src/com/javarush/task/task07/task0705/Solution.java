package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[20];
        int[] B = new int[10];
        int[] C = new int[10];
        for (int i = 0; i < 20; i++) {
            A[i] = Integer.parseInt(br.readLine());
            if (i < 10) {
                B[i] = A[i];
            } else {
                C[i - 10] = A[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(C[i]);
        }
    }
}
