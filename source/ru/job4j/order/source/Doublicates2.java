package ru.job4j.order.source.ru.job4j.order.source;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Doublicates2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        List<Integer> numbers = Arrays.stream(nums).collect();
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (numbers.contains(num)) {

            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
