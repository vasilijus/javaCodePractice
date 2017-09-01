package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int num = Integer.parseInt(sNum);
        String answer = null;

        if ((0 < num) && (num < 1000)) {
            switch (sNum.length()) {
                case 1:
                    answer = "однозначное";
                    break;
                case 2:
                    answer = "двузначное";
                    break;
                case 3:
                    answer = "трехзначное";
                    break;
            }
            if ((num % 2) == 0)
                System.out.println("четное " + answer + " число");
            else
                System.out.println("нечетное " + answer + " число");
        }
    }
}

/*  MOI CODE!!!!!!!!!!!!!!!!!!!!!!!
        BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
        String size = i.readLine();
        int num = Integer.parseInt(size);
        int len = size.length();

        String chot = "";
        String chislo = "";
        Boolean chotNot= false;

        if(num % 2 == 0) {
            chotNot = true;
        } else chotNot = false;
        if (chotNot){
            chot = "четное";
        } else chot = "нечетное";

        if(len== 1) {
            chislo = "однозначное";
        } else if(len== 2) {
            chislo = "двузначное";
        } else if(len== 3) chislo = "трехзначное";

        System.out.println(chot +" "+ chislo+" "+ "число");
        */
