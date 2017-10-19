/**
 * Author: Egor_Che
 * 16.10.2017
 * Aplana
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void run(String[] args) {
        //добавим повтор для неверного знака операции
        while (true) {

            Scanner input = new Scanner(System.in);
            //объявляю переменные
            double firstDouble;
            double secondDouble;
            double slozhenie = 0, umnozhenie = 0, vichitanie = 0, delenie = 0;
            String userChoice = "";
            String[] choices = {"+", "*", "-", "/"};

            //Пользовательский ввод
            System.out.println("Вводите дробные числа в таком формате: 456,93 (через запятую)");
            System.out.print("Введите первое число: ");
            try {
                firstDouble = input.nextDouble();
            } catch (InputMismatchException err) {
                System.out.println("Нефиг фигню писать!");
                continue;
            }
            System.out.print("Введите знак операции: ");
            userChoice = input.next();
            System.out.print("Введите второе число: ");
            try {
                secondDouble = input.nextDouble();
            } catch (InputMismatchException err) {
                System.out.println("Нефиг фигню писать!");
                continue;
            }

            if (userChoice.equals("+")) {
                slozhenie = firstDouble + secondDouble;
                System.out.print("Сумма = ");
                double i = slozhenie;
                System.out.printf("%.4f", i);
                break;
            }
            if (userChoice.equals("*")) {
                umnozhenie = firstDouble * secondDouble;
                System.out.print("Произведение = ");
                double i = umnozhenie;
                System.out.printf("%.4f", i);
                break;
            }
            if (userChoice.equals("-")) {
                vichitanie = firstDouble - secondDouble;
                System.out.print("Разность = ");
                double i = vichitanie;
                System.out.printf("%.4f", i);
                break;
            }
            if (userChoice.equals("/")) {
                if (secondDouble == 0) {
                    System.out.println("На ноль делить нельзя!");
                    System.out.println("Повторите попытку заново");
                } else {
                    System.out.print("Частное = ");
                    delenie = firstDouble / secondDouble;
                    double i = delenie;
                    System.out.printf("%.4f", i);
                    break;
                }
            } else {
                System.out.println("Вы неверно ввели знак действия");
                System.out.println("Повторите попытку заново");
            }
        }
        System.out.println("\n" + "Введите цифру: 1 или 2 для выбора программы, или 0 для выхода");
    }
}