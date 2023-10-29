package leetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a = new int[] { 4, 2, 3, 0, 0, 0 }; // criados externamente, para ser vinculado e executar a função com os
                                                  // valores externos
        merge(a, 3, new int[] { 2, 5, 6 }, 3);
        System.out.println(Arrays.toString(a));

        int[] b = new int[] { 1 };
        merge(b, 1, new int[] {}, 0);
        System.out.println(Arrays.toString(b));

        int[] c = new int[] { 0 };
        merge(c, 0, new int[] { 1 }, 1);
        System.out.println(Arrays.toString(c));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] numsResult = new int[m + n];
        int j = 0;

        for (int i = 0; i < m; i++) {
            numsResult[i] = nums1[i];
        }

        for (int i = m; i < numsResult.length; i++) {
            numsResult[i] = nums2[j];
            j++;
        }

        for (int i = 0; i < numsResult.length; i++) {
            nums1[i] = numsResult[i];
        }

        Arrays.sort(nums1);
    }
}