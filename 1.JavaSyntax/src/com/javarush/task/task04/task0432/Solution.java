package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        int o = 0 , n = Integer.parseInt(reader.readLine());
        while ( n > o){
            System.out.println(s);
            o++;
        }
    }
}
