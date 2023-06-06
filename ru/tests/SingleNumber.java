package ru.job4j.order.ru.tests;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        for (int i : nums) {
            if (first.contains(i)) {
                second.add(i);
            } else {
            first.add(i);
            }
        }
        first.removeAll(second);
        return first.get(0);
    }

    /*public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }*/

    public static void main(String[] args) {
        System.out.println(SingleNumber.singleNumber(new int[]{1}));
    }
}
