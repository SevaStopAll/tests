package ru.job4j.order.ru.tests;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_TO_DO {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, 0);
        }
        for (int i : nums) {
            map.computeIfPresent(i, (key, value) -> value + 1);
        }
        return map.get(map.values().stream().max(Integer::compareTo).get());
    }

    public static void main(String[] args) {
        MajorityElement_TO_DO maj = new MajorityElement_TO_DO();
        System.out.println(maj.majorityElement(new int[]{3, 2, 3}));
    }
}