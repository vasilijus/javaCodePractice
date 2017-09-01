package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String weak = bufferedReader.readLine();
        int weakStrToInt = Integer.parseInt(weak);

        if (weakStrToInt < 1 || weakStrToInt >= 8) {
            System.out.println("такого дня недели не существует");
        } else if (weakStrToInt == 1) {
            System.out.println("понедельник");
        } else if (weakStrToInt == 2) {
            System.out.println("вторник");
        } else if (weakStrToInt == 3) {
            System.out.println("среда");
        } else if (weakStrToInt == 4) {
            System.out.println("четверг");
        } else if (weakStrToInt == 5) {
            System.out.println("пятница");
        } else if (weakStrToInt == 6) {
            System.out.println("суббота");
        } else {
            System.out.println("воскресенье");
        }
    }
}