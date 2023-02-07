package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[20];
        int size = 0;
        int dif = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (dif >= coins[i]) {
                dif = dif - coins[i];
                rsl[size] = coins[i];
                size = size + 1;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}