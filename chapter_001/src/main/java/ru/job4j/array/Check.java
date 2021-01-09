package ru.job4j.array;

import java.util.*;

/**
 * Class Check
 * @author Vasiliy Orlov
 */
public class Check {
    /**
     * Method mono.
     * @param data - input array.
     * @return - equals all value in array.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
          for (int i = 1; i < data.length; i++) {
              if (data[0] != data[i]) {
                  result = false;
                  break;
              }
          }
        return result;
    }

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int sdacha = money - price;
        for (int i = 0; i < coins.length;) {
            if (sdacha >= coins[i]) {
                rsl[size] = coins[i];
                sdacha -= coins[i];
                size++;
            } else {
                i++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(change(100, 52)));
    }
}
