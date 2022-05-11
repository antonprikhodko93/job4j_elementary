package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short mheight) {
        double rsl = (mheight - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short wheight) {
        double rsl = (wheight - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short mheight = 187;
        double man = Fit.manWeight(mheight);
        System.out.println("Man 187 is " + man);
        short wheight = 167;
        double woman = Fit.womanWeight(wheight);
        System.out.println("Woman 167 is " + woman);
    }

}
