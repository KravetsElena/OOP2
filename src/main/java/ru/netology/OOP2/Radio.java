package ru.netology.OOP2;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;


    public Radio(int maxStation) {
        this.maxStation = maxStation - 1;
        this.minStation = minStation;
        this.currentStation = minStation;
    }

    public Radio() {

    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setNextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= maxStation) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        }
        if (currentStation <= 0) {
            currentStation = maxStation;
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
