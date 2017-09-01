package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>(); //вместо квадратных скобок проставить угловые
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) list.add(i+1, "именно");
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
