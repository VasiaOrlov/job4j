package ru.job4j.array;

/**
 * Class Square.
 * @author Vasiliy Orlov.
 */
public class Square {
    /**
     * Method calculate.
     * @param bound - size array.
     * @return - array.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int row = 0; row < bound; row++) {
          rst[row] = (int) Math.pow(row + 1, 2);
        }
        return rst;
    }
}
