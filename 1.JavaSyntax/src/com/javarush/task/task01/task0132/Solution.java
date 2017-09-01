package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import sun.security.util.Length;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String convNumToStr = Integer.toString(number);
        int strlength = convNumToStr.length(); // for loop

        int return_num = 0; // store all data in it

        for (int i = 0; i < strlength ; i++){
            return_num = return_num + Integer.parseInt( Character.toString(convNumToStr.charAt(i) ) ); // i toString & character to Integer

        }
        return return_num;
    }
}




  //  public static int sumDigitsInNumber(int number) {
  //    String sNumb = Integer.toString(number);
  //    int len_S = sNumb.length();
  //     int number_return = 0;
//     int i;
//      for ( i = 0; i < len_S; i++) {
//         number_return = number_return + Integer.parseInt(Character.toString(sNumb.charAt(i)));
//     }
//     return number_return;