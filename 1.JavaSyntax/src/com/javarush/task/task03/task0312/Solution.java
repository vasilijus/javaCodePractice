package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour) {
        int result = hour * 3600;
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            int randNum = 10 + (int) (Math.random() * 50);
            System.out.println(convertToSeconds(randNum));
        }
    }
}
