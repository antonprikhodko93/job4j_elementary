package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] tab = new int[size][size];
        for (int row = 0; row < tab.length; row++) {
            for (int cell = 0; cell < tab[row].length; cell++) {
                tab[row][cell] = (row + 1) * (cell + 1);
                }
        }
        return tab;
    }
}
