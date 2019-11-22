package ru.job4j.array;

/**
 * Class Min.
 * @author  Vasiliy Orlov.
 */
public class Min {
    /**
     * Method findMin - find the minimum.
     * @param array - array.
     * @return - minimum value array.
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
