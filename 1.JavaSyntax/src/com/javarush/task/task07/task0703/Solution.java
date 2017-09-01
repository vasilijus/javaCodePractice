package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] stroki = new String[10];
        int[] kolvo = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0 ; i <= kolvo.length-1 ; i++){
            stroki[i] = br.readLine();
            kolvo[i] = stroki[i].length();
            //System.out.println("stroki "+ stroki[i]+" "+kolvo[i]);
            System.out.println(kolvo[i]);
        }

    }
}
