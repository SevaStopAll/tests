package ru.job4j.order.ru.tests;

public class Tockens {
    public static void main(String[] args) {
        String s = "YES      leading spaces        are - valid,    problemsetters are         evillllll";
        String [] strings = s.split("[&]");
        System.out.println(strings.length);
        for (String str : strings) {
            System.out.println(str);
        }
    }
}


