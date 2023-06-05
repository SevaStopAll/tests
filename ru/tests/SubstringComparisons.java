package ru.job4j.order.ru.tests;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "zzz";
        String largest = "";
        int beginIndex = 0;
        String res = "";
        for(int i = beginIndex; i < s.length() - k+1; i++) {
            res = s.substring(i, i + k);
            if (smallest.compareTo(res) > 0) {
                smallest = res;
            }
            if (largest.compareTo(res) < 0) {
                largest = res;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        System.out.println(SubstringComparisons.getSmallestAndLargest("welcometojava", 3));
    }
}
