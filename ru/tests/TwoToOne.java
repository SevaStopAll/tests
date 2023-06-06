package ru.job4j.order.ru.tests;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        String[] string1 = s1.split("");
        String[] string2 = s2.split("");
        Set<String> result = new TreeSet<>();
        for (String s : string1) {
            result.add(s);
        }
        for (String str2 : string2) {
            result.add(str2);
        }
        StringBuilder builder = new StringBuilder();
        result.stream().forEach(s -> builder.append(s));
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(TwoToOne.longest("aretheyhere", "yestheyarehere"));
    }
}
