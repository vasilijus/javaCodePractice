package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        if((a!=b&&a!=c)&&b==c)System.out.println("1");
        if((b!=a&&b!=c)&&a==c)System.out.println("2");
        if((c!=a&&c!=b)&&a==b)System.out.println("3");

        /*
        int a = Integer.parseInt(inp.readLine());
        int b = Integer.parseInt(inp.readLine());
        int c = Integer.parseInt(inp.readLine());

        //int tmp = a^b^c;
        if(a != b && a!=c) System.out.print(1);
        else if (b!=c && b!= a) System.out.print(2);
            else System.out.println(3);
        //System.out.println(tmp);
        */
    }
}
