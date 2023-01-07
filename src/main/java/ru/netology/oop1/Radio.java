package ru.netology.oop1;

public class Radio {

    private int currentVolume;
    private int currentStation;

    public Radio() {
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 10) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }


    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}









