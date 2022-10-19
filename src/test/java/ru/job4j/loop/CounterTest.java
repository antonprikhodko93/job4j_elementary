package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumNumbersFromThreeToSevenThenTwentyFive() {
        int start = 3;
        int finish = 7;
        int result = Counter.sum(start, finish);
        int expected = 25;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromSixToTwelveThenThirtySix() {
        int start = 6;
        int finish = 12;
        int result = Counter.sumByEven(start, finish);
        int expected = 36;
        assertThat(result).isEqualTo(expected);
    }
}