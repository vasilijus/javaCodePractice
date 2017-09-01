package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String fNum = bufferedReader.readLine();
        String sNum = bufferedReader.readLine();
        int fiNum = Integer.parseInt(fNum);
        int seNum = Integer.parseInt(sNum);
        System.out.println(name + " получает " + fiNum + " через " + seNum + " лет");
    }
}
