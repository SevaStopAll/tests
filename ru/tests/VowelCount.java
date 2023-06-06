package ru.job4j.order.ru.tests;

import java.util.Set;

public class VowelCount {

    public static int getCount(String str) {
        Set<Character> chars = Set.of('a', 'e', 'i', 'o', 'u');
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (chars.contains(str.charAt(i))) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(VowelCount.getCount("abracadabra"));
    }
}
