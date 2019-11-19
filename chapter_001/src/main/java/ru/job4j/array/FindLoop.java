package ru.job4j.array;

/**
 * Class FindLoop.
 * @author Vasiliy Orlov.
 */
public class FindLoop {
    /**
     * Method indexOf - find index value el.
     * @param data - array.
     * @param el - find value.
     * @return - index value.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
