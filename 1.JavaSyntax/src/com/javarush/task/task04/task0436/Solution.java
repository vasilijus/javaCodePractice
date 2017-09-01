package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int m=0,n=0;
        m = Integer.parseInt(r.readLine());
        n = Integer.parseInt(r.readLine());

        for( int i = 1; i < m+1 ;i++){
            for(int j = 1; j < n+1;j++){
                System.out.print("8");
            }
         System.out.println("");
        }

    }
}
