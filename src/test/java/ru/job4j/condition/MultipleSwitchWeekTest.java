package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MultipleSwitchWeekTest {

    @Test
    public void nameOfMondayRus() {
        String in = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void nameOfMonday() {
        String in = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void nameOfThursdayRus() {
        String in = "Четверг";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void nameOfSunday() {
        String in = "Sunday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void nameOfNothingday() {
        String in = "day";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}