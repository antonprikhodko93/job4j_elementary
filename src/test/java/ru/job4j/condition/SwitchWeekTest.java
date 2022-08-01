package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class SwitchWeekTest {

    @Test
    public void nameOfMonday() {
        int in = 1;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "�����������";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void nameOfTuesday() {
        int in = 2;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "�������";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void nameOfUnday() {
        int in = 8;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "������";
        assertThat(result).isEqualTo(expected);
    }
}