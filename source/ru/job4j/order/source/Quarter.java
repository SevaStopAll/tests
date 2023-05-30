package ru.job4j.order.source;

public class Quarter {
    public static int quarterOf(int month) {
        return (month + 2) / 3;
    }

    public static void main(String[] args) {
        System.out.println(Quarter.quarterOf(11));
    }
}
