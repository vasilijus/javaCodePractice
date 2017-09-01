package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        int lineA = Integer.parseInt(reader.readLine());
        int lineB = Integer.parseInt(reader.readLine());
        int lineC = Integer.parseInt(reader.readLine());

        if (lineA + lineB > lineC && lineB + lineC > lineA && lineC + lineA > lineB){
            System.out.println("Треугольник существует.");
        } else System.out.println("Треугольник не существует.");
    }
}