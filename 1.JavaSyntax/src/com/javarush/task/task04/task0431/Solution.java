package com.javarush.task.task04.task0431;

/* 
От 10 до 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 11;
        while (i>1) {
            i--;
            System.out.println(i);
        }
    }
}
