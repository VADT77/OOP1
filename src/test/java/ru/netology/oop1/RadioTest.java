package ru.netology.oop1;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    Radio radio=new Radio();
    radio.setCurrentStation (8);

    radio.next();

    int expected = 9;
    int actual = radio.getCurrentStation();
    Assertions.assertEquals(expected, actual);
}
