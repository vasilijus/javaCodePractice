package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        convertEurToUsd(4, 2.2);
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double Usd = eur * course;
        System.out.println(Usd);
        return Usd;
    }
}
