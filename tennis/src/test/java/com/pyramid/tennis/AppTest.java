package com.pyramid.tennis;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

    Game game;

    @Before
    public void init() {
        game = new Game();
    }

    @Test
    public void initGame() {
        assertEquals("love - love", new Game().getPoints());
    }

    @Test
    public void addPoint() {
        Game game = new Game();
        game.addPoint("player1");
        assertEquals("fifteen - love", game.getPoints());
    }

    @Test
    public void addPointToPlayer2() {
        Game game = new Game();
        game.addPoint("player2");
        assertEquals("love - fifteen", game.getPoints());
    }

    @Test
    public void addSecondPointToPlayer2() {
        game.addPoint("player2");
        game.addPoint("player2");
        assertEquals("love - thirty", game.getPoints());
    }
}
