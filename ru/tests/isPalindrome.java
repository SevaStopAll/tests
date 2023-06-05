package ru.job4j.order.ru.tests;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String a = sc.next();
        String result = "Yes";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                result = "No";
            }
        }
        System.out.println(result);

    }
}
