package ru.netology.oop1;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void verifyNext() {


        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationMoreTen() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.setCurrentStation(11);

        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentstationMoreZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.setCurrentStation(-1);

        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}

