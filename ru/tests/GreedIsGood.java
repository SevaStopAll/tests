package ru.job4j.order.ru.tests;

import java.util.HashMap;
import java.util.Map;

public class GreedIsGood {

    public static int greedy(int[] dice){
        Map<Integer, Integer> dices = new HashMap<>();
        dices.put(1, 0);
        dices.put(2, 0);
        dices.put(3, 0);
        dices.put(4, 0);
        dices.put(5, 0);
        dices.put(6, 0);
        for (int oneDice : dice) {
            dices.computeIfPresent(oneDice, (key, val) -> val + oneDice);
        }
        int sum = 0;
        int one = dices.get(1) / 3 * 1000 + dices.get(1) % 3 * 100;
                int two = dices.get(2) / 2 / 3 * 200;
                        int three = dices.get(3) / 3 / 3 * 300;
                                int four = dices.get(4) / 4 / 3 * 400;
                                        int five = dices.get(5) / 5 / 3 * 500 + dices.get(5) / 5 % 3 * 50;
                                                int six = dices.get(6) / 6 / 3 * 600;
        return sum + one + two + three + four + five + six;
    }

    public static void main(String[] args) {
        System.out.println(GreedIsGood.greedy(new int[] {1,1,1,3,1}));
    }
}
