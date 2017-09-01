package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = 0,b = 0;

        String lines = "";
        while(a <10){

            while (b<10) {
                lines = lines + "S";
                b++;
            }
            b = 0;
            System.out.println(lines);
            lines = "";


            a++;
        }

    }
}
