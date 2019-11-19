package ru.job4j.array;

/**
 * Class Matrix.
 * @author Vasiliy Orlov.
 */
public class Matrix {
    /**
     * Method multiple.
     * @param size - size  table.
     * @return - table with result multiple.
     */
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}