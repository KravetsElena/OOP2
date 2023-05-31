package ru.netology.OOP2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void ShouldAmountStation() {
        Radio radio = new Radio(7);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(6, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOverTopLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationTopLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAnderTopLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOverLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAnderLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAnderLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.setNextStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationOverLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.setNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationTopLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAnderTopLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.setNextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    //    @Test
//    public void shouldSetNextStationOverTopLimit() {
//        Radio radio = new Radio();
//        radio.setCurrentStation(10);
//        radio.setNextStation();
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
    @Test
    public void shouldSetPrevStationTopLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationAnderTopLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prevStation();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationOverTopLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationAnderLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationOverLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOverTopLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOverLowLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeTopLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAnderLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAnderTopLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeTopLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeAnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.
                assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.
                assertEquals(expected, actual);
    }
}