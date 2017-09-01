package com.javarush.task.task08.task0817;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        for(int i = 0 ; i < 10; i++){
            map.put("Sur"+i, "Name"+i);
        }
        map.put("asd", "Name2");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String,String> copy = new HashMap(map);
        for(Map.Entry key : copy.entrySet()){
            for(Map.Entry key2 : copy.entrySet()){
                if(key.getValue().equals(key2.getValue()) && !key.getKey().equals(key2.getKey())){
                    String s = String.valueOf(key2.getValue());
                    removeItemFromMapByValue(map,s);
                }
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
            System.out.println(pair.getKey());
        }
    }

    public static void main(String[] args) {
        createMap();
        removeTheFirstNameDuplicates(createMap());
    }
}

    function truncateString(str, num) {
        // Clear out that junk in your trunk
        var strIncrement = "";
        if (str.length < 3) {
            console.log(str);
            return str;
        } else if (str.length > num){
            for (var i = 0; i < num - 3 ; i++){
                strIncrement += str[i];
            } strIncrement += "...";
            console.log(strIncrement);
        } else {
            // normal
            for (var j = 0; j < num - 3 ; j++){
                strIncrement += str[j];
            }console.log(strIncrement);
        }
        return str;
    }