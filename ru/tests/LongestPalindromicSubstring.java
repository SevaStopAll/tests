import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        LongestPalindromicSubstring sub = new LongestPalindromicSubstring();
        System.out.println(sub.longestPalindrome("abb"));
    }

    public String longestPalindrome(String s) {
        Set<String> palindromes = new TreeSet<>(Comparator.comparingInt(String::length).reversed());
        if (s.length() == 1) {
            return s;
        }
        int count = 0;
        int end = count + 1;
            while (count < s.length()) {
                if (count + end > s.length()) {
                    isPalindrome(s);
                    break;
                }
                    String answer = isPalindrome(s.substring(count, end + 1));
                    if (!answer.equals("no")) {
                        palindromes.add(answer);
                        end++;
                        if (count + end + 1 > s.length()) {
                            count++;
                            end = count + 1;
                        }
                    } else {
                        end++;
                        if (count + end + 1 > s.length()) {
                        count++;
                        end = count + 1;
                        }
                    }
            }
            return (palindromes.size() == 0) ? s.substring(0,1) : palindromes.iterator().next();
    }

    public String isPalindrome(String s) {
        if (s.length() == 1) {
            return "no";
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return "no";
            }
        }
        return s;
    }

}
