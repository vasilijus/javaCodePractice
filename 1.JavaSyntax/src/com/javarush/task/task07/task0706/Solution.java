package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] house = new int[15];
        int chot = 0;
        int nechot = 0;

        for(int i = 0 ; i <16-1; i++){
            house[i] = Integer.parseInt(br.readLine());
            if (i%2==0 || i==0){
                chot+= house[i];
            } else nechot +=house[i];
        }
        if(chot>nechot) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else  System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
