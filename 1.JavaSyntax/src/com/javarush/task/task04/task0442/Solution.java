package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = 0;
        first:
        while (true) {
            int a = Integer.parseInt(reader.readLine());
            if (a != -1) {
                b = b + a;
            } else {
                b = b - 1;
                System.out.println(b);
                break first;

            }
        }

        /*BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        Boolean isExit = false;

        while(!isExit) {
            String s = r.readLine();
            isExit = s.equals("-1");
            if(isExit == false){
                int num = Integer.parseInt(s);
                sum = sum + num;
                System.out.println(sum);
            } else {
                int num = Integer.parseInt(s);
                sum = sum + num;
                System.out.println(sum);
            }
        }*/
    }
}
