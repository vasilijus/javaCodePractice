package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Pedto1", new Date("JAN 23 1989"));
        map.put("Pedto2", new Date("JAN 23 1990"));
        map.put("Pedto3", new Date("JAN 23 1991"));
        map.put("Pedto4", new Date("JAN 23 1992"));
        map.put("Pedto5", new Date("JAN 23 1993"));
        map.put("Pedto6", new Date("JAN 23 1994"));
        map.put("Pedto7", new Date("JAN 23 1995"));
        map.put("Pedto8", new Date("JAN 23 1996"));
        map.put("Pedto9", new Date("JAN 23 1997"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        HashMap copy = new HashMap(map);
        System.out.println(copy);
    }

    public static void main(String[] args) {

    }
}
