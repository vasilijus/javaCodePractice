package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    public String name = null;
    public  int age = 5;
    public int weight = 5;
    public String address = null;
    public String color = "red";

    public Cat(String name){
        this.name = name;
    }
    public Cat(String name, int weight, int age){
        this.name = name; this.weight = weight; this.age = age;
    }
    public Cat(String name,int age){
        this.name = name; this.age = age;
    }
    public Cat(int weight, String color){
        this.weight = weight; this.color=color;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight; this.color=color; this.address=address;
    }

    public static void main(String[] args) {

    }
}
