package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldTheRadioStationTurnOn99() {
        Radio radio = new Radio(100);

        radio.setCurrentRadioStation(99);

        int expected = 99;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationTurnOn90() {
        Radio radio = new Radio(100);

        radio.setCurrentRadioStation(90);

        int expected = 90;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationTurnOn50() {
        Radio radio = new Radio(100);

        radio.setCurrentRadioStation(50);

        int expected = 50;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationTurnOn0() {
        Radio radio = new Radio(100);

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationTurnOn1() {
        Radio radio = new Radio(100);

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationTurnOn100() {
        Radio radio = new Radio(100);

        radio.setCurrentRadioStation(100);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationWillBeMore99() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(99);

        radio.increaseRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationSwitchFrom100To99() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(100);

        radio.decreaseRadioStation();

        int expected = 99;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationSwitchFrom0To1() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(0);

        radio.increaseRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationBeLess0() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(0);

        radio.decreaseRadioStation();

        int expected = 99;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationSwitchFrom99To100() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(99);

        radio.increaseRadioStation();

        int expected = 100;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationSwitchFrom49To50() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(49);

        radio.increaseRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationSwitchFrom48To49() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(48);

        radio.increaseRadioStation();

        int expected = 49;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationSwitchFrom14To15() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(14);

        radio.increaseRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationSwitchFrom13To14() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(13);

        radio.increaseRadioStation();

        int expected = 14;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationSwitchFrom24To25() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(24);

        radio.increaseRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationSwitchFrom23To24() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(23);

        radio.increaseRadioStation();

        int expected = 24;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationSwitchFrom25To26() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(25);

        radio.increaseRadioStation();

        int expected = 49;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadioStationTurnOn156() {
        Radio radio = new Radio(100);

        radio.setCurrentRadioStation(156);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadio1StationTurnOn9() {
        Radio radio1 = new Radio();

        radio1.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio1.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadio1StationTurnOn8() {
        Radio radio1 = new Radio();

        radio1.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio1.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadio1StationTurnOn6() {
        Radio radio1 = new Radio();

        radio1.setCurrentRadioStation(6);

        int expected = 6;
        int actual = radio1.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadio1StationTurnOn0() {
        Radio radio1 = new Radio();

        radio1.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio1.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadio1StationTurnOn1() {
        Radio radio1 = new Radio();

        radio1.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio1.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadio1StationTurnOn10() {
        Radio radio1 = new Radio();

        radio1.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio1.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadio1StationWillBeMore9() {
        Radio radio1 = new Radio();
        radio1.setCurrentRadioStation(9);

        radio1.increaseRadioStation();

        int expected = 0;
        int actual = radio1.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadio1StationSwitchFrom9To8() {
        Radio radio1 = new Radio();
        radio1.setCurrentRadioStation(9);

        radio1.decreaseRadioStation();

        int expected = 8;
        int actual = radio1.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadio1StationSwitchFrom0To1() {
        Radio radio1 = new Radio();
        radio1.setCurrentRadioStation(0);

        radio1.increaseRadioStation();

        int expected = 1;
        int actual = radio1.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadio1StationWillBeLess0() {
        Radio radio1 = new Radio();
        radio1.setCurrentRadioStation(0);

        radio1.decreaseRadioStation();

        int expected = 9;
        int actual = radio1.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadio1StationSwitchFrom8To9() {
        Radio radio1 = new Radio();
        radio1.setCurrentRadioStation(8);

        radio1.increaseRadioStation();

        int expected = 9;
        int actual = radio1.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheRadio1StationTurnOn100() {
        Radio radio1 = new Radio();

        radio1.setCurrentRadioStation(100);

        int expected = 0;
        int actual = radio1.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheVolumeTurnOnTo100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheVolumeTurnOnTo99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheVolumeTurnOnTo0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheVolumeTurnOnTo1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheVolumeTurnOnTo101() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheVolumeIncreaseFrom99To100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheVolumeIncreaseFrom100To101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheVolumeIncreaseFrom0To1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheVolumeDecreaseFrom100To99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheVolumeDecreaseFrom1To0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTheVolumeDecreaseFrom0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    private void assertEquals(int expected, int actual) {
    }
}