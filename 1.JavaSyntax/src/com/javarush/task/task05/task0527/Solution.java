package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код
        Cat catTom = new Cat("Tom", 50,5);
        Dog bullDog = new Dog("Bull", 60,2);
        System.out.println(catTom);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
    public static class Cat{
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail){
            this.name=name; this.height=height; this.tail=tail;
        }
        public String toString(){
            return name;
        }
    }
    public static class Dog{
        String name;
        int height;
        int tail;
        public Dog(String name, int height, int tail){
            this.name=name ; this.height=height ; this.tail=tail;
        }
    }
}
