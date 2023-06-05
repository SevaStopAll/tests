package ru.job4j.order.ru.tests;

public class TimeToBuy {

    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if (op < pist) {
                op = pist;
            }
        }
        return op;
    }


    public static void main(String[] args) {
        TimeToBuy buy = new TimeToBuy();
        System.out.println(buy.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
