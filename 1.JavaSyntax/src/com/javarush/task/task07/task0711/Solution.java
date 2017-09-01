package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.String;
/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(5);
        String tmp = null;
        for(int n = 0 ; n < 5; n++){
            String s = br.readLine();
            list.add(n,s);
        }
        //System.out.println(list);
        for (int i = 0; i < 13; i++) {
            tmp = list.remove(4);
            list.add(0,tmp);
            //System.out.println(list);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
