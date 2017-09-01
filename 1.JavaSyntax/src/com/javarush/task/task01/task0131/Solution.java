package com.javarush.task.task01.task0131;

/* 
Полнометражная картина
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        //напишите тут ваш код
        int num = centimetre / 100;
        return num;
    }
}