package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
1. Метод getDistance должен возвращать double.
2. Метод getDistance должен быть статическим.
3. Метод getDistance должен быть public.
4. Метод getDistance должен возвращать расстояние между точками.
5. Метод getDistance должен использовать метод double Math.sqrt(double a).
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double x = (x1-x2);
        double y = (y1-y2);
        double distance= Math.sqrt(x*x + y*y);
        System.out.println(distance);
        return distance;
    }

    public static void main(String[] args) {

    }
}
