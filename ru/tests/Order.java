package ru.job4j.order.ru.tests;

import java.util.HashMap;
import java.util.Map;

public class Order {

    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }
        Map<Integer, String> sentence = new HashMap<>();

        String[] word = words.split(" ");
        for (String laMot : word) {
            for (int i = 0; i < laMot.length(); i++) {
                if (Character.isDigit(laMot.charAt(i))) {
                    sentence.put(Integer.valueOf(laMot.charAt(i) + ""),laMot);
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < word.length + 1; i++) {
            builder.append(sentence.get(i));
            builder.append(" ");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(Order.order("4of Fo1r pe6ople g3ood th5e the2"));
    }
}
