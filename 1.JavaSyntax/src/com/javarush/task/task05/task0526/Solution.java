package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Pedro",25,"22 Eden");
        Man man2 = new Man("Stili",23, "11Ou");
        System.out.println(man1);
        System.out.println(man2);

        Woman woman1 = new Woman("sucka", 18, "1 a");
        Woman woman2 = new Woman("Ilda", 21, "1 b");
        System.out.println(woman1);
        System.out.println(woman2);
    }

    //напишите тут ваш код
    public static class Man{
        String name;
        int age;
        String address;
        public Man(String name){ this.name=name; }
        public Man(String name,int age){ this.name=name; this.age=age;}
        public Man(String name,int age,String address){ this.name=name; this.age=age; this.address=address;}
        public String toString(){
            return this.name+" "+this.age+" "+this.address;
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;
        public Woman(String name){ this.name=name; }
        public Woman(String name,int age){ this.name=name; this.age=age;}
        public Woman(String name,int age,String address){ this.name=name; this.age=age; this.address=address;}
        @Override
        public String toString(){
            return this.name+" "+this.age+" "+this.address;
        }
    }
}
