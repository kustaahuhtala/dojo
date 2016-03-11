package com.pyramid.tennis;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void initGame() {
        assertEquals("love - love", new App().init());
    }

    @Test
    public void addPoint() {
        App app = new App();
        app.addPoint(1);

        assertEquals(1, app.getPoints());
    }
}
