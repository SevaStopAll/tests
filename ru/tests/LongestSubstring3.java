import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring3 {
    public static void main(String[] args) {
        LongestSubstring3 substring = new LongestSubstring3();
        System.out.println(substring.lengthOfLongestSubstring("abcabcbb"));
    }

    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 1) {
            return 1;
        }
        if (s.length() == 0) {
            return 0;
        }
        return countMaxSubstring(s);
    }

    public int countMaxSubstring( String s) {
        List<Integer> list = new ArrayList<>();
        Set<Character> chars = new HashSet<>();
        int leng = 0;
        for (int i = 0; i < s.length(); i++) {
            leng = 0;
            for (int j = i; j < s.length(); j++) {
                char check = s.charAt(j);
                if (chars.contains(check)) {
                    chars.clear();
                    list.add(leng);
                    leng = 0;
                    break;
                } else {
                    chars.add(check);
                    leng++;
                }
            }
            list.add(leng);
        }
        list.add(leng);
        return list.stream().max(Integer::compareTo).get();
    }

}
