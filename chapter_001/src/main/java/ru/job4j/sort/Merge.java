package ru.job4j.sort;

import java.util.Arrays;

/**
 * Class Merge.
 * @author Vasiliy Orlov.
 */
public class Merge {

    /**
     * Method merge - create array of two.
     * @param left - first array.
     * @param right - second array.
     * @return - array one of two.
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index1 = 0, index2 = 0;
        while (index1 + index2 < rsl.length) {
            if (index1 >= left.length) {
                rsl[index1 + index2] = right[index2];
                index2++;
            } else if (index2 >= right.length) {
                rsl[index1 + index2] = left[index1];
                index1++;
            } else if (left[index1] <= right[index2]) {
                rsl[index1 + index2] = left[index1];
                index1++;
            } else {
                rsl[index1 + index2] = right[index2];
                index2++;
            }
        }
        return rsl;
    }

    /**
     * Method main.
     * @param args - args.
     */
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}