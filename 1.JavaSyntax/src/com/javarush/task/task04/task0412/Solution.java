package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.lang.String;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = "";

        str = bufferedReader.readLine();

        int strToInt = Integer.parseInt(str);
        System.out.println();
        if (strToInt > 0) {
            System.out.println(strToInt * 2);
        } else if(strToInt < 0){
            System.out.println(strToInt + 1);
        } else System.out.println("0");
    }

}