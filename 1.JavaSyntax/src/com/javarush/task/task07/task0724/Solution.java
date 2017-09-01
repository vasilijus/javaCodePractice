package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human h1 = new Human("Галя", false, 67);
        Human h2 = new Human("Леша", true, 70);
        Human h3 = new Human("Вова", true, 68);
        Human h4 = new Human("Лида", false, 67);
        Human h5 = new Human("Инна", false, 50, h3, h4);
        Human h6 = new Human("Валера", true, 53, h2,h1);
        Human h7 = new Human("Артем", true, 25, h6, h5);
        Human h8 = new Human("Саша", true, 28, h6, h5);
        Human h9 = new Human("Маффа", false,6, h6, h5);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);
        System.out.println(h6);
        System.out.println(h7);
        System.out.println(h8);
        System.out.println(h9);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}





















