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

    /**
     * Method indexOf - find index value el in the range from start to finish.
     * @param data - array.
     * @param el - find value.
     * @param start - start index.
     * @param finish - finish index.
     * @return - index value.
     */
    public static int indexOfNew(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Method sort.
     * @param data - array.
     * @return - sort array.
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, 0 + i, data.length -1);
            int index = indexOfNew(data, min, 0 + i, data.length - 1);
            data[index] = data[i];
            data[i] = min;
        }
        return data;
    }
}
