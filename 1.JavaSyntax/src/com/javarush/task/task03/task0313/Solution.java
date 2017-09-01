package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String[] mam_wash = {"Мама", "Мыла", "Раму"};
        String print_wash;
        int i, j, k;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i != j) {
                    for (k = 0; k < 3; k++) {
                        if (k != i & k != j) {
                            print_wash = "";
                            print_wash = mam_wash[i] + mam_wash[j] + mam_wash[k];
                            System.out.println(print_wash);
                        }

                    }

                }
            }
        }
    }
}