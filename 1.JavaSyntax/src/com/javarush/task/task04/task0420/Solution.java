package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int a=Integer.parseInt(read.readLine());
        int b=Integer.parseInt(read.readLine());
        int c=Integer.parseInt(read.readLine());
        boolean needsort = true;
        int tmp; //to store the small number
        int i;
        while (needsort) {
            if (a<b)
            {
                tmp = a;
                a = b;
                b = tmp;
                needsort = true;
            }
            else if (b<c)
            {
                tmp = b;
                b = c;
                c = tmp;
                needsort = true;
            }
            else
            {
                needsort = false;
            }

        }
        System.out.println(a + " "+b+" " +c);

    }
}
