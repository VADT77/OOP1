package ru.netology.oop1;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public int  getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume (int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation (int currentStation) {
        this.currentStation = currentStation;
    }
}

public class Radio {
  ...

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
}

public class Radio {
  ...

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




        }
    }

                Yury Malyshkin, [28.11.2022 22:19]
public void next  () {
        if ( currentStation  < 9) {
        currentStation++;
        return;
        }
        currentStation = 0;
        }


public void next  () {
        if ( currentStation  < 9) {
        currentStation++;
        }else{
        currentStation = 0;
        }
        }


