package ru.netology.oop1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class VolumeTest {
    @Test
    public void volumeTrialOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
        @Test
        public void volumeTrialMax() {
            Radio radio = new Radio();
            radio.setCurrentVolume(10);

            radio.increaseVolume();

            int expected = 10;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }

    @Test
    public void volumeTrialTwo() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.decreaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeTrialMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

