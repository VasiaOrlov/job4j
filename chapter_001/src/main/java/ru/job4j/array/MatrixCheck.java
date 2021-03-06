package ru.job4j.array;

/**
 * Class MatrixCheck.
 * @author Vasiliy Orlov.
 */
public class MatrixCheck {
    /**
     * Method isWin - print array and shows result.
     * @param board - input array.
     * @return - result check.
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
            }
            System.out.println();
        }
        for (int row = 0; row < board.length && !result; row++) {
            if (board[row][row] == 'X') {
                int a = 0;
                int b = 0;
                for (int cell = 0; cell < board.length; cell++) {
                    if (board[row][cell] == 'X') {
                        a++;
                    }
                    if (board[cell][row] == 'X') {
                        b++;
                    }
                }
                result = a == board.length || b == board.length;
            }
        }
        return result;
    }

    /**
     * Method main.
     * @param args - args.
     */
    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}
