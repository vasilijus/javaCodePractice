package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        String xx = reader.readLine();
        String xxx = reader.readLine();
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(xx);
        int c = Integer.parseInt(xxx);
        if (a==b & b==c)
            System.out.println(a+" "+b+" "+c);
        else if (a==b)
            System.out.println(a+" "+b);
        else if (a==c)
            System.out.println(a+" "+c);
        else if (c==b)
            System.out.println(c+" "+b);
    }
}