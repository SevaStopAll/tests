import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.putIfAbsent(i, 0);
        }
        for (int i : nums) {
            map.computeIfPresent(i, (key, value) -> value+1);
        }
        int targetValue = map.values().stream().max(Integer::compareTo).get();
        int majority = 0;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == targetValue) {
                majority = pair.getKey();
            }
        }
        return majority;
    }
}
