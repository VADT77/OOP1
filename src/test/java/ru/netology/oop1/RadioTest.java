package ru.netology.oop1;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void verifyNext() { // .... ;

        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
