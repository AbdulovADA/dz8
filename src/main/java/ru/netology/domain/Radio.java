package ru.netology.domain;

public class Radio {

    public int currentWave;

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < 0) {
            return;
        }
        if (newCurrentWave > 9) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void next() {
        if (currentWave == 9) {
            int newCurrentWave = 0;
            setCurrentWave(newCurrentWave);
            return;
        }
        if (currentWave < 9) {
            int newCurrentWave = currentWave + 1;
            setCurrentWave(newCurrentWave);
        }
    }

    public void prev() {
        if (currentWave == 0) {
            int newCurrentWave = 9;
            setCurrentWave(newCurrentWave);
            return;
        }
        if (currentWave > 0) {
            int newCurrentWave = currentWave - 1;
            setCurrentWave(newCurrentWave);
        }
    }

    public int currentVolume;

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            int newCurrentVolume = currentVolume + 1;
            setCurrentVolume(newCurrentVolume);
        }
    }

    public void lowerVolume() {
        if (currentVolume > 0) {
            int newCurrentVolume = currentVolume - 1;
            setCurrentVolume(newCurrentVolume);
        }

    }
}





