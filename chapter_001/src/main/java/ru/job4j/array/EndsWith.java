package ru.job4j.array;

/**
 * Class EndWith.
 * @author  Vasiliy Orlov.
 */
public class EndsWith {
    /**
     * Method endsWith.
     * @param word - check word.
     * @param post - check post.
     * @return - equals post and finish word.
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (post[post.length - 1 - i] != word[word.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
