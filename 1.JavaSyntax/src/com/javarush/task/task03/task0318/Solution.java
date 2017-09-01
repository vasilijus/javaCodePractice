package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String sAge = bufferedReader.readLine();
        int iAge = Integer.parseInt(sAge);
        System.out.println(name + " захватит мир через " + iAge + " лет. Му-ха-ха!");
    }
}
//InputStream inputStream = System.in;
//Reader inputStreamReader = new InputStreamReader(inputStream);
//BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

//String name = bufferedReader.readLine(); //читаем строку с клавиатуры
//String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
//int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.