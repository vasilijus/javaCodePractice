package com.javarush.task.task04.task0406;

/* 
Реализовать метод setName
*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        //напишите тут ваш код
        this.fullName = firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("vasia", "usenko");

    }

}
