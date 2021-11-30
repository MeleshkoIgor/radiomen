package ru.netology.domain;

public class Radio {
    private int id;
    private int numberRadioStations = 10;
    private int currentRadioStation = 5;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 50;
    private boolean on;

    public Radio(int numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
    }

    public Radio() {

    }

    public int setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation > (numberRadioStations - 1)) {
            currentRadioStation = 0;
        }
        if (currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation;
        }

        this.currentRadioStation = currentRadioStation;
        return currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
            currentVolume = currentVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = currentVolume;
        }
    }

    public void increaseRadioStation() {

        if (currentRadioStation < (numberRadioStations - 1)) {
            currentRadioStation = currentRadioStation + 1;

        } else if (currentRadioStation == (numberRadioStations - 1)) {
            currentRadioStation = 0;
            return;
        }

        this.currentRadioStation = currentRadioStation;
    }

    public void decreaseRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = numberRadioStations - 1;
        }
    }
}