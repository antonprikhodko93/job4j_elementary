package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("distance between A(0, 0) to B(2, 0) = " + result);
        double result2 = Point.distance(2, 4, 1, 4);
        System.out.println("distance between C(2, 4) to D(1, 4) = " + result2);
        double result3 = Point.distance(4, 6, 8, 9);
        System.out.println("distance between E(4, 6) to F(8, 9) = " + result3);
    }
}