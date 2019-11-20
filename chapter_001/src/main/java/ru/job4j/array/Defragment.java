package ru.job4j.array;

/**
 * Class Defragment.
 * @author Vasiliy Orlov.
 */
public class Defragment {
    /**
     * Method compress.
     * @param array - input array.
     * @return - finish array.
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                for (int i = index + 1; i< array.length; i++) {
                    if (array[i] != null) {
                        array[index] = array[i];
                        array[i] = null;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    /**
     * Method compress1.
     * @param array - input array.
     * @return - finish array.
     */
    public static String[] compress1(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int i = index;
                while (i < array.length - 1) {
                    if (array[i + 1] != null) {
                       array[index] = array[i + 1];
                       array[i + 1] = null;
                       break;
                    } else {
                        i++;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    /**
     * Method main.
     * @param args - args.
     */
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] input1 = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        String[] compressed1 = compress1(input1);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
        System.out.println();
        for (int index = 0; index < compressed1.length; index++) {
            System.out.print(compressed1[index] + " ");
        }
    }
}
