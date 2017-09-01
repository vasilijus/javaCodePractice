package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(5);
        int minLength=10;
        // dlia zapisi masiva
        for(int i = 0; i < 5; i++){
            String s = br.readLine();
            list.add(s);
            if(s.length()>0)
                if(s.length()<minLength){
                minLength = s.length();
                }
        }

        //dlia vivoda min gde Min length
        for(int p = 0; p < 5; p++){
            if(list.get(p).length() == minLength){
                System.out.println(list.get(p));
            }
        }
    }
}
