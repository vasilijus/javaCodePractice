package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float sum = 0;
        Boolean isExit = false;
        int count = 0;
        while (!isExit) {
            //int num = Integer.parseInt(reader.readLine());
            float num = Float.parseFloat(reader.readLine());
            count++;
            if (num != -1) {
                sum += num;
            } else {
                count--;
                sum /= count;
                isExit = true;
            }
        }
        System.out.println(sum);
    }
}