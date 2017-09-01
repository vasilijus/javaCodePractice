package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int min,max,med;
        if(a <= b && a <= c)
            min = a;
        else if(b <= c && b <= a)
            min = b;
        else
            min = c;
        if(a >= b && a >= c)
            max = a;
        else if(b >= c && b >= a)
            max = b;
        else
            max = c;
        med = a + b + c - min - max;
        System.out.println(med);
    }
}
