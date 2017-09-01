package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int den = Integer.parseInt(reader.readLine());
        proverit(den);
    }


    private static void proverit(int den) {
        if (den%100 == 0){
            if (den%400 == 0){
                System.out.println("количество дней в году: 366");
            } else {
                System.out.println("количество дней в году: 365");
            }
        } else if ( den%4 == 0) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }

    }
}
