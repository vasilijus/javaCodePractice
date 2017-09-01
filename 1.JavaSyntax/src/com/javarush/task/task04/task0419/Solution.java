package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
//import java.util.Arrays; only for - Arrays.sort();

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream input = System.in;
        InputStreamReader inputReader = new InputStreamReader(input);
        BufferedReader bufferedReader = new BufferedReader(inputReader);

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());
        Solution solution = new Solution();
        int max = solution.minimum(solution.minimum(a, b), solution.minimum(c, d));
        System.out.println(max);
    }



    public int minimum(int x ,int y){
        if(x > y ){
            return x;
        } else return y;
    }


}
/*
int[] intArr = {Integer.valueOf(bufferedReader.readLine()),Integer.parseInt(bufferedReader.readLine()),
                        Integer.valueOf(bufferedReader.readLine()),Integer.valueOf(bufferedReader.readLine())  };
        int max;
        if (intArr[0] > intArr[1] ) max = intArr[0];
        else max = intArr[1];
        if (intArr[2] > max ) max = intArr[2];
         else if (intArr[3] > max) max = intArr[3];
            else System.out.println(max);
        System.out.println(max);
 */