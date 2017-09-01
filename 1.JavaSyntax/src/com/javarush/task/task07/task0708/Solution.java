package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<String>();
        int size = 0;
        String stroka=null;
        for (int i = 0;i <5 ; i++){
            String s = br.readLine();
            arr.add(s);
        }
        for(int j = 0 ;j<arr.size(); j++){
            int b  = arr.get(j).length();
            //System.out.println(b);
            if(b> size) {
                //System.out.println(b +" is more than " + size);
                size = arr.get(j).length();
                stroka = arr.get(j);
                //System.out.println(stroka);
            }
        }
        for(int l = 0 ; l < arr.size();l++){
            if(arr.get(l).length() == size){
                System.out.println(arr.get(l));
            }
        }

    }
}
