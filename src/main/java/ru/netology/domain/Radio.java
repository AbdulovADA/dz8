package ru.netology.domain;

public class Radio {
    private int amountWave = 10;
    private int minWave;
    private int maxWave = amountWave - 1;
    private int currentWave;
    private int currentVolume;
    private int minVolume;
    private int maxVolume = 100;

    public Radio(int amountWave) {
        this.amountWave = amountWave;
        this.maxWave = amountWave - 1;
    }

    public Radio() {
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < minWave) {
            return;
        }
        if (newCurrentWave > maxWave) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinWave() {
        return minWave;
    }

    public int getMaxWave() {
        return maxWave;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void next() {
        int newCurrentWave;
        if (currentWave != maxWave) {
            newCurrentWave = currentWave + 1;
        } else {
            newCurrentWave = minWave;
        }
        setCurrentWave(newCurrentWave);
    }

    public void prev() {
        int newCurrentWave;
        if (currentWave != minWave) {
            newCurrentWave = currentWave - 1;
        } else {
            newCurrentWave = maxWave;
        }
        setCurrentWave(newCurrentWave);
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            int newCurrentVolume = currentVolume + 1;
            setCurrentVolume(newCurrentVolume);
        }
    }

    public void lowerVolume() {
        if (currentVolume > minVolume) {
            int newCurrentVolume = currentVolume - 1;
            setCurrentVolume(newCurrentVolume);
        }
    }
}





