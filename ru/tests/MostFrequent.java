import java.util.*;

public class MostFrequent {
    public int mostFrequentCycles(int[] nums) {
        int mostFrequent = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num > 1 && num % 2 == 0) {
                map.putIfAbsent(num, 0);
            }
        }
        for (int i : nums) {
            if (i > 1 && i % 2 == 0) {
                map.computeIfPresent(i, (key, value) -> value + 1);
            }
        }
        if (map.entrySet().size() == 0) {
            return mostFrequent;
        }
        int targetValue = map.values().stream().max(Integer::compareTo).get();
        List<Integer> maxValues = new ArrayList<>();
        for (Map.Entry<Integer, Integer> pair: map.entrySet()) {
            if (pair.getValue() == targetValue) {
                maxValues.add(pair.getKey());
            }
        }
        return maxValues.stream().min(Integer::compareTo).get();
    }

    public int mostFrequentEvenStreams(int[] nums) {
        int mostFrequent = -1;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).filter(num -> num % 2 == 0).forEach(num -> map.putIfAbsent(num, 0));
        Arrays.stream(nums).filter(num -> num % 2 == 0).forEach(num -> map.computeIfPresent(num, (key, value) -> value + 1));
        if (map.entrySet().size() == 0) {
            return mostFrequent;
        }
        int targetValue = map.values().stream().max(Integer::compareTo).get();
        List<Integer> maxValues = new ArrayList<>();
        map.entrySet().stream().filter(pair -> pair.getValue() == targetValue).forEach(pair -> maxValues.add(pair.getKey()));
        return maxValues.stream().min(Integer::compareTo).get();
    }
}
