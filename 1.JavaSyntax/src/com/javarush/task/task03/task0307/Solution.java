package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for(int i = 1 ; i<11 ; i++){
            Zerg zerg = new Zerg();
            zerg.name = "zerg" + i;
            System.out.println(zerg.name);
        }
        for (int j = 1 ; j<6;j++){
            Protoss protoss = new Protoss();
            protoss.name = "protoss" + j;
            System.out.println(protoss.name);
        }
        for (int k = 1 ; k < 13;k++){
            Terran terran = new Terran();
            terran.name = "terran"+ k;
            System.out.println(terran.name);
        }

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
