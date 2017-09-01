package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        //::CODE:
        int aa, bb, ten = 10;
        aa = a - ten;
        bb = b - ten;
        aa = abs(aa);
        bb = abs(bb);
        //System.out.println(aa + "aa");
        //System.out.println(bb + "bb");
        if (aa < bb) {
            System.out.println(a);
        } else if (bb < aa) {
            System.out.println(b);
        } else System.out.println(a);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}