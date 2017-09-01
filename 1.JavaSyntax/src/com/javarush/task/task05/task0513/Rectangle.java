package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int left,top,width,height;
    public void initialize(int left){this.left=left;}
    public void initialize(int left,int top){this.left=left; this.top=top;}
    public void initialize(int left,int top,int width){this.left=left; this.top=top; this.width=width; this.height=height;}
    public void initialize(Rectangle anotherRectangle){
        this.left = anotherRectangle.left;
        this.top = anotherRectangle.top;
        this.width = anotherRectangle.width;
        this.height = anotherRectangle.height;
    }

    public static void main(String[] args) {

    }
}
