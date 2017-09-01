package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
Программа должна считывать данные с клавиатуры.
2. Метод main должен посчитать сколько четных цифр во веденном числе и записать это количество в переменную even.
3. Метод main должен посчитать сколько нечетных цифр во веденном числе и записать это количество в переменную odd.
4. Программа должна выводить текст на экран.
5. Выведенный текст должен соответствовать заданию.
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] strNum = br.readLine().toCharArray();

        for(int i = 0;i < strNum.length;i++){
            if(strNum[i]%2 == 0){
                even++;
            } else odd++;
        }
        System.out.println("Even: "+even+" Odd: "+odd);

    }
}
