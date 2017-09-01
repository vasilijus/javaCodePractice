package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
        String s = i.readLine();
        int a = Integer.parseInt(i.readLine());
        if(a>20) System.out.println("И 18-ти достаточно");
    }
}
