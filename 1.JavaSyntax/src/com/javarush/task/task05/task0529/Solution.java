package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.String;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String sum = "сумма";
        int s = 0;
        for (int i = 0; i != -1; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String a = br.readLine();
            if (a.equals(sum)) {
                break;
            }
            else {
                int w = Integer.parseInt(a);
                s = s + w;
            }
        }
        System.out.println(s);//напишите тут ваш код
    }
}
