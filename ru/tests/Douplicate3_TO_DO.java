package ru.job4j.order.ru.tests;

/*        You are given an integer array nums and two integers indexDiff and valueDiff.

                Find a pair of indices (i, j) such that:

        i != j,
                abs(i - j) <= indexDiff.
                        abs(nums[i] - nums[j]) <= valueDiff, and
        Return true if such pair exists or false otherwise.*/


public class Douplicate3_TO_DO {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j && Math.abs(i - j) <= indexDiff && Math.abs(nums[i] - nums[j]) <= valueDiff) {
                    return true;
                }
            }
        }
        return false;
    }



    public static void main(String[] args) {
        Douplicate3_TO_DO dup = new Douplicate3_TO_DO();
        System.out.println(dup.containsNearbyAlmostDuplicate(new int[] {1,2,3,1}, 3, 0));
    }
}
