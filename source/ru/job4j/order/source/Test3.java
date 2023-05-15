package ru.job4j.order.source;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(countReview("dbbccca"));
    }
    public static int countReview(String letters) {
        boolean containsA = false;
        boolean containsB = false;
        boolean containsC = false;
        boolean containsD = false;
        if (letters.contains("a")) {
            containsA = true;
        }
        if (letters.contains("b")) {
            containsB = true;
        }
        if (letters.contains("c")) {
            containsC = true;
        }
        if (letters.contains("d")) {
            containsD = true;
        }
        int currentRes;
        if (!containsA || !containsB || !containsC || !containsD) {
            return -1;
        } else {
            currentRes = 999;
            for (int j = 0; j < letters.length(); j++) {
                int k = 0;
                int a = 1;
                int b = 1;
                int c = 1;
                int d = 1;
                for (int i = j; i < letters.length(); i++) {
                    if (letters.charAt(i) == 'a') {
                        a--;
                    }
                    if (letters.charAt(i) == 'b') {
                        b--;
                    }
                    if (letters.charAt(i) == 'c') {
                        c--;
                    }
                    if (letters.charAt(i) == 'd') {
                        d--;
                    }
                    k++;
                    if (a <= 0 && b <= 0 && c <= 0 && d <= 0) {
                        if (k < currentRes) {
                            currentRes = k;
                        }
                    }
                }
            }
        }
        return currentRes;
    }
}
