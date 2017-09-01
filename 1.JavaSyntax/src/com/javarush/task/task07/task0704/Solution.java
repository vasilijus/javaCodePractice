package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cisla = new int[10];
        for (int i = 0;i <= cisla.length -1; i++){
            cisla[i] = Integer.parseInt(br.readLine());
        }
        for(int j = cisla.length-1;j >= 0; j--){
            System.out.println(cisla[j]);
        }
    }
}

