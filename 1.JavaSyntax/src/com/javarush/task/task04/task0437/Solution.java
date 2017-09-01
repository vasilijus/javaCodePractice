package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int m = 2;

        for(int i = 0 ; i < 10 ; i++){
            for(int k = 1 ; k < m;k++){
                System.out.print("8");
            }
            m++;
            System.out.println("");
        }
    }
}
