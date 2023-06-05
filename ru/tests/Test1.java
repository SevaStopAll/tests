package ru.job4j.order.ru.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        System.out.println(height("1,3,3,4,1,"));
    }

    public static String height(String people) {
        List<String> persons = new ArrayList<>(Arrays.asList(people.split(",")));
        List<Integer> heights = new ArrayList<>();
        for (String s : persons) {
            heights.add(Integer.parseInt(s));
        }
        String yes = "YES";
        String no = "NO";
        for (int i = 1; i < heights.size() - 1; i++) {
            if (!(heights.get(i) >= heights.get(i - 1) && heights.get(i) <= heights.get(i + 1) && !(heights.get(i) <= heights.get(i - 1) && heights.get(i) >= heights.get(i + 1)))) {
            return no;
            }
        }
        return yes;
    }
}
