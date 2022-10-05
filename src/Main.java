import java.sql.SQLOutput;

import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }


    private static void task1() {
        int ages = 17;
        if (ages >= 18) {
            System.out.println("Поздравляем тебе есть 18 лет");
        } else {
            System.out.println("Упс,кажется тебе еще нет 18 лет");
        }
    }

    private static void task2() {
        int ages = 7;
        if (ages < 18) {
            System.out.println("Ты ученик!");
        } else if (ages >= 18)
            if (ages < 24) {
                System.out.println("Ты можешь отправиться в университет!");
            } else {
                System.out.println("Ты можешь устроиться на работу");
            }
    }

    private static void task3() {
        int person = 83;
        if (person <= 60) {
            System.out.println("В вагоне еще есть сидячие места!");
        } else if (person > 60)
            if (person < 102) {
                System.out.println("В вагоне есть стоячие места");
            } else {
                System.out.println("В вагоне нет мест");
            }
    }

    private static void task4() {
        int age = 9;
        boolean GoToSchool = age >= 3 & age <= 6;
        if (GoToSchool) {
            System.out.println("Тебе пора в детский сад!");
        } else if (GoToSchool = age >= 7 & age <= 18) {
            System.out.println("Тебе пора в школу!");
        } else if (GoToSchool = age >= 18 & age <= 24) {
            System.out.println("Тебе пора в университет");
        } else if (GoToSchool = age > 24) {
            System.out.println("Тебе пора на работу");
        }
    }

    private static void task5() {
        int one = 3;
        int two = 4;
        int free = 5;
        if(one > two && one>free)
        {System.out.println("Максимальное число из всех "+ one);}
        else if (two >one && two>free){
            System.out.println("Максимальное число "+ two);}
          else if (free>two && free>one);{
            System.out.println("Максимальное число"+free);
        }}}


            



