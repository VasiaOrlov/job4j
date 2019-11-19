package ru.job4j.array;

/**
 * Class Turn.
 * @author Vasiliy Orlov.
 */
public class Turn {
    /**
     * Method back.
     * @param array - start array.
     * @return - finish array.
     */
    public int[] back(int[] array) {
        for (int i = 0; i <= (array.length - 1) / 2; i++) {
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
