package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int anyNumber = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        if (anyNumber > 0) {
            if (anyNumber%2 == 0) {
                System.out.println("положительное четное число");
            } else {
                System.out.println("положительное нечетное число");
            }
        } else if (anyNumber < 0) {
            if (anyNumber%2 == 0) {
                System.out.println("отрицательное четное число");
            } else {
                System.out.println("отрицательное нечетное число");
            }
        } else if (anyNumber == 0) {
            System.out.println("ноль");
        }
        /*
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());
        if(n < 0) {
            if(n % 1 == 1){
                System.out.println("отрицательное нечетное число");
            } else System.out.println("отрицательное четное число");
        } else if( n > 0){
            if(n % 1 == 1){
                System.out.println("положительное нечетное число");
            } else System.out.println("положительное четное число");
        } else if(n == 0) System.out.println("0");

        // ese odin

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String descr;
        if (num == 0)
            descr = "ноль";
        else {
            descr = (num < 0) ? "отрицательное " : "положительное ";
            descr += (num % 2 == 0) ? "четное число" : "нечетное число";
        }
        System.out.println(descr);

        */
    }
}
