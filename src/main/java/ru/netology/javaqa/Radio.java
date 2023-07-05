package ru.netology.javaqa;
public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation >9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <0 ) {
            return;
        }
        if (currentVolume >100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void plusVolumeByOne() {
        if (currentVolume <100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void minusVolumeByOne() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

}
