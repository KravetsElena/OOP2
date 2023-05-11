package ru.netology.OOP2;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setNextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= 9) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation <= 0) {
            currentStation = 9;
        }
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= 100) {
            return;
        }
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            return;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
