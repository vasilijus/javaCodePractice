package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int left, top, width, height;

    public Rectangle(int left){
        this.left=left;
    }
    public Rectangle(int left,int top){
        this.left=left; this.top=top;
    }
    public Rectangle(int left,int top, int width){
        this.left=left; this.top=top; this.width=width;
    }
    public Rectangle(Rectangle anotherRectangle){
        this.left = anotherRectangle.left; this.top=anotherRectangle.top; this.width=anotherRectangle.width; this.height=anotherRectangle.height;
    }
    public static void main(String[] args) {

    }
}
