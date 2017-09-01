package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] lenght = {read.readLine(),read.readLine(),read.readLine()};
        int pol=0, otr=0;
         for(int i = 0; i < lenght.length; i++){
             int num = Integer.parseInt(lenght[i]);

             if (num < 0 ) otr++;
             if (num > 0 ) pol++;
         }
        System.out.println("количество отрицательных чисел: " + otr);
        System.out.println("количество положительных чисел: " + pol);
    }
}
