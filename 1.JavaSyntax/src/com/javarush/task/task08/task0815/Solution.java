package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap createMap() {
        HashMap map = new HashMap();
        for (int i = 0; i < 10; i++) {
            map.put("Ф" + i, "И"+i);
        }
        return map;
    }
    public static int getCountTheSameFirstName(HashMap<String,String> map, String name) {
        int count=0;
        for( HashMap.Entry pair : map.entrySet()) {
            if(pair.getValue() == name) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count=0;
        for( HashMap.Entry pair : map.entrySet()) {
            if(pair.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
