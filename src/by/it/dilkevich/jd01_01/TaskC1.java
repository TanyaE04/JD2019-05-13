package by.it.dilkevich.jd01_01;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
class TaskC1 {
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);
        int firstNumber = word.nextInt();
        int secondNumber = word.nextInt();
        System.out.println("Sum = " + (firstNumber + secondNumber));
    }




}
