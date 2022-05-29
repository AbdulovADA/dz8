package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void findBorders() {
        Radio cond = new Radio();
        cond.setCurrentWave(-1);

        int actual = cond.getCurrentWave();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findBorders2() {
        Radio cond = new Radio();
        cond.setCurrentWave(0);

        int actual = cond.getCurrentWave();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findBorders3() {
        Radio cond = new Radio();
        cond.setCurrentWave(1);

        int actual = cond.getCurrentWave();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findBorders4() {
        Radio cond = new Radio();
        cond.setCurrentWave(8);

        int actual = cond.getCurrentWave();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findBorders5() {
        Radio cond = new Radio();
        cond.setCurrentWave(9);

        int actual = cond.getCurrentWave();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findBorders6() {
        Radio cond = new Radio();
        cond.setCurrentWave(10);

        int actual = cond.getCurrentWave();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextWave() {
        Radio cond = new Radio();
        cond.setCurrentWave(0);

        cond.next();

        int actual = cond.getCurrentWave();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    void nextWave2() {
        Radio cond = new Radio();
        cond.setCurrentWave(9);

        cond.next();

        int actual = cond.getCurrentWave();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    void nextWave3() {
        Radio cond = new Radio();
        cond.setCurrentWave(8);

        cond.next();

        int actual = cond.getCurrentWave();
        int expected = 9;

        assertEquals(expected, actual);

    }

    @Test
    void nextWave4() {
        Radio cond = new Radio();
        cond.setCurrentWave(10);

        cond.next();

        int actual = cond.getCurrentWave();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    void nextWave5() {
        Radio cond = new Radio();
        cond.setCurrentWave(-1);

        cond.next();

        int actual = cond.getCurrentWave();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    void nextWave6() {
        Radio cond = new Radio();
        cond.setCurrentWave(1);

        cond.next();

        int actual = cond.getCurrentWave();
        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    void prevWave() {
        Radio cond = new Radio();
        cond.setCurrentWave(0);

        cond.prev();

        int actual = cond.getCurrentWave();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void prevWave2() {
        Radio cond = new Radio();
        cond.setCurrentWave(4);

        cond.prev();

        int actual = cond.getCurrentWave();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void findVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findVolume2() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findVolume3() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);

        int actual = cond.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findVolume4() {
        Radio cond = new Radio();
        cond.setCurrentVolume(9);

        int actual = cond.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findVolume5() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);

        int actual = cond.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void findVolume6() {
        Radio cond = new Radio();
        cond.setCurrentVolume(11);

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void upVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void upVolume2() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void downVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.lowerVolume();

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void downVolume2() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);

        cond.lowerVolume();

        int actual = cond.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }
}