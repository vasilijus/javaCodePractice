package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] array = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i =0;i <20;i++){
            //System.out.println("Nr: " + i);
            int num = Integer.parseInt(br.readLine());
            array[i] =  num;
        }
        return array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = 0;
        for (int i = 0; i <array.length;i++){
            if (array[i] > max){
                max = array[i];
                //System.out.println("max is : "+max);
            }
        }
        return max;
    }
}
