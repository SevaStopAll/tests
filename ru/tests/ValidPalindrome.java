package ru.job4j.order.ru.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        char[] symbols = s.toCharArray();
        List<Character> letters = new ArrayList<>();
        for (char ch : symbols) {
            if (Character.isLetterOrDigit(ch)) {
                letters.add(Character.toLowerCase(ch));
            }
        }
        for (int i = 0; i < letters.size(); i++) {
            if (letters.get(i) != letters.get(letters.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama")   );
    }
}
