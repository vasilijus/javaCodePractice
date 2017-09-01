package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int x1 = Integer.parseInt(read.readLine());
        int x2 = Integer.parseInt(read.readLine());

        //System.out.println("x1 = "+x1+" "+"x2 = "+x2);
        if (x1<x2) System.out.println(x1);
            else if (x1>x2) System.out.println(x2);
                else System.out.println(x1);
    }
}