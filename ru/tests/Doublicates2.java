package ru.job4j.order.ru.tests;

import java.util.HashSet;
import java.util.Set;

public class Doublicates2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> noDub = new HashSet<>();
        Set<Integer> dubs= new HashSet<>();
        for (int i : nums) {
            if (noDub.contains(i)) {
                dubs.add(i);
            }
            noDub.add(i);
        }
        int a1 = -1;
        for (int j : dubs) {
           for (int z = 0; z < nums.length; z++) {
               if (nums[z] == j) {
                   a1 = z;
                   for (int x = z + 1; x < nums.length; x++) {
                       if (nums[x] == j && Math.abs(z - x) <= k) {
                           return true;
                       }
                   }
               }
           }
        }
        return false;
    }

    public static void main(String[] args) {
        Doublicates2 dub = new Doublicates2();
        System.out.println(dub.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
    }
}
