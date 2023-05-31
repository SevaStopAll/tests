package ru.job4j.order.source.ru.job4j.order.source;

public class MergeSortedArrayTODO {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int b = 0; b < nums2.length; b++) {
            for (int i = 0; i < nums1.length; i++) {
                if (nums2[i] <= nums1[b]) {
                    int k = 0;
                    int y = i;
                    while (y < nums1.length) {
                        k =  nums1[y + 1] ;
                        nums1[y + 1] = nums1[y];
                        y++;
                    }
                }
            }
        }

    }
}
