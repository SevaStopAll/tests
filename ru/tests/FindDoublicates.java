package ru.job4j.order.ru.tests;

import java.util.HashSet;
import java.util.Set;

public class FindDoublicates {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (numbers.contains(num)) {
                return false;
            }
            numbers.add(num);
        }
        return true;
    }
}
