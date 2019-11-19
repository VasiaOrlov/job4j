package ru.job4j.array;

/**
 * Class ArrayChar.
 * @author Vasiliy Orlov.
 */
public class ArrayChar {
    /**
     * Method startWith.
     * @param word - check word.
     * @param pref - check pref.
     * @return - equals pref and start word
     */
    public static boolean startWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
