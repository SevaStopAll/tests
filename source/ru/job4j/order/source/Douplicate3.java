package ru.job4j.order.source;

/*        You are given an integer array nums and two integers indexDiff and valueDiff.

                Find a pair of indices (i, j) such that:

        i != j,
                abs(i - j) <= indexDiff.
                        abs(nums[i] - nums[j]) <= valueDiff, and
        Return true if such pair exists or false otherwise.*/


import java.util.HashSet;
import java.util.Set;

public class Douplicate3 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                        if (j != i && Math.abs(i - j) <= indexDiff && i < nums.length && i > 0 && Math.abs(nums[i] - nums[j]) <= valueDiff) {
                            return true;
                        }
                    }
                }
        return false;
        }



    public static void main(String[] args) {
        Douplicate3 dup = new Douplicate3();
        System.out.println(dup.containsNearbyAlmostDuplicate(new int[] {-3,3,-6}, 2, 3));
    }
}
