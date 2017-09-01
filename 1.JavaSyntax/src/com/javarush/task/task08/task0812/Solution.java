package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        int max = 1, x = 1;
        for (int i = 0; i < 9; i++) {
            if (list.get(i) == list.get(i+1)) x++;
            else x = 1;

            if (max < x) max = x;
        }
        System.out.println(max);
    }
}