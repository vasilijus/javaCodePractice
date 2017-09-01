package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList(10);
        //напишите тут ваш код
        for(int i = 0; i < 10;i++){
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        Collections.reverse(numbers);
        for(int i = 0;i<10;i++){
            System.out.println(numbers.get(i));
        }
    }
}
