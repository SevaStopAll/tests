import java.util.HashMap;
import java.util.Map;

public class isAnagram {

    static boolean isAnagram(String a, String b) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char character : a.toCharArray()) {
            map1.computeIfPresent(character, (key, value) -> value + 1);
            map1.putIfAbsent(character, 1);
        }
        for (char character : b.toCharArray()) {
            map2.computeIfPresent(character, (key, value) -> value + 1);
            map2.putIfAbsent(character, 1);
        }
        if (map1.equals(map2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int operation = 2;
        int number = 10;
        switch (operation) {
            case 1:        number = number + 10;        break;
            case 2:        number = number - 4;
            case 3:        number = number / 3;
            case 4:        number = number * 10;        break;
            }
        System.out.println(number);
    }



}
