package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader i = new BufferedReader(new InputStreamReader(System.in));

        String str1 = i.readLine();
        String str2 = i.readLine();

        if (str1.equals(str2)) {
            System.out.println("Имена идентичны");
        } else if (str1.length() == str2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
