package ru.job4j.order.source;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(countReview("7,3,2"));
    }

    public static int countReview(String numbers) {
        List<String> reviews = new ArrayList<>(Arrays.asList(numbers.split(",")));
        int juns = Integer.parseInt(reviews.get(0));
        int sens = Integer.parseInt(reviews.get(1));
        int check = Integer.parseInt(reviews.get(2));
        return (int) Math.round((double)juns * check / sens);
    }
}
