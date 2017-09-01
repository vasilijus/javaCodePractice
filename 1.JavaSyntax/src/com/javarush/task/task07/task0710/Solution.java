package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(10);
        for (int i =0 ; i<10;i++){
            String s = br.readLine();
            list.add(0,s);
        }
        for(String x :list) System.out.println(x);
    }
}
