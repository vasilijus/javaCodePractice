package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 1;i<=20;i++){
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        HashSet res = (HashSet) set.clone();
        for (Integer num : set) {
            if (num > 10) res.remove(num);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
