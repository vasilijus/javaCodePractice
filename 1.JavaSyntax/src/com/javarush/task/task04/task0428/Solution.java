package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = {Integer.parseInt(read.readLine()), Integer.parseInt(read.readLine()), Integer.parseInt(read.readLine())};
        int is = 0;
        for( int i = 0; i <3; i++){
            if(nums[i] > 0){
                is++;
            }

        }
        System.out.println(is);
    }
}
