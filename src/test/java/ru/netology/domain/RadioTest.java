package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio cond = new Radio();

    @Test
    void DataRadio() {
        assertEquals(0, cond.getMinWave());
        assertEquals(9, cond.getMaxWave());
        assertEquals(0, cond.getMinVolume());
        assertEquals(100, cond.getMaxVolume());
    }

    @Test
    void DataRadio2() {
        Radio cond = new Radio(666);
        assertEquals(0, cond.getMinWave());
        assertEquals(665, cond.getMaxWave());
        assertEquals(0, cond.getMinVolume());
        assertEquals(100, cond.getMaxVolume());
    }

    @Test
    void sizeBorders() {
        Radio cond = new Radio(15);
        cond.setCurrentWave(14);
        assertEquals(14, cond.getCurrentWave());
    }

    @Test
    void sizeBorders2() {
        Radio cond = new Radio(15);
        cond.setCurrentWave(15);
        assertEquals(0, cond.getCurrentWave());
    }

    @Test
    void findBorders() {
        cond.setCurrentWave(-1);

        assertEquals(0, cond.getCurrentWave());
    }

    @Test
    void findBorders2() {
        cond.setCurrentWave(0);

        assertEquals(0, cond.getCurrentWave());
    }

    @Test
    void findBorders3() {
        cond.setCurrentWave(1);

        assertEquals(1, cond.getCurrentWave());
    }

    @Test
    void findBorders4() {
        cond.setCurrentWave(8);

        assertEquals(8, cond.getCurrentWave());
    }

    @Test
    void findBorders5() {
        cond.setCurrentWave(9);
        assertEquals(9, cond.getCurrentWave());
    }

    @Test
    void findBorders6() {
        cond.setCurrentWave(10);
        assertEquals(0, cond.getCurrentWave());
    }

    @Test
    void nextWave() {
        cond.setCurrentWave(0);
        cond.next();
        assertEquals(1, cond.getCurrentWave());
    }

    @Test
    void nextWave2() {
        cond.setCurrentWave(9);
        cond.next();
        assertEquals(0, cond.getCurrentWave());
    }

    @Test
    void nextWave3() {
        cond.setCurrentWave(10);
        cond.next();
        assertEquals(1, cond.getCurrentWave());
    }

    @Test
    void nextWave4() {
        cond.setCurrentWave(1);
        cond.next();
        assertEquals(2, cond.getCurrentWave());
    }

    @Test
    void prevWave() {
        cond.setCurrentWave(0);
        cond.prev();
        assertEquals(9, cond.getCurrentWave());
    }

    @Test
    void prevWave2() {
        cond.setCurrentWave(4);
        cond.prev();
        assertEquals(3, cond.getCurrentWave());
    }

    @Test
    void findVolume() {
        cond.setCurrentVolume(-2);
        assertEquals(0, cond.getCurrentVolume());
    }

    @Test
    void findVolume2() {
        cond.setCurrentVolume(25);
        assertEquals(25, cond.getCurrentVolume());
    }

    @Test
    void findVolume3() {
        cond.setCurrentVolume(100);
        assertEquals(100, cond.getCurrentVolume());
    }

    @Test
    void findVolume4() {
        cond.setCurrentVolume(150);
        assertEquals(0, cond.getCurrentVolume());
    }


    @Test
    void upVolume() {
        cond.setCurrentVolume(0);
        cond.increaseVolume();
        assertEquals(1, cond.getCurrentVolume());
    }

    @Test
    void upVolume2() {
        cond.setCurrentVolume(100);
        cond.increaseVolume();
        assertEquals(100, cond.getCurrentVolume());
    }

    @Test
    void downVolume() {
        cond.setCurrentVolume(0);
        cond.lowerVolume();
        assertEquals(0, cond.getCurrentVolume());
    }

    @Test
    void downVolume2() {
        cond.setCurrentVolume(30);
        cond.lowerVolume();
        assertEquals(29, cond.getCurrentVolume());
    }
}