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

    @Test
    public void addPointsToPlayers() {
        game.addPoint("player2");
        game.addPoint("player1");
        assertEquals("fifteen - fifteen", game.getPoints());
        game.addPoint("player2");
        game.addPoint("player1");
        assertEquals("deuce", game.getPoints());
        game.addPoint("player1");
        assertEquals("forty - thirty", game.getPoints());
        game.addPoint("player2");
        assertEquals("deuce", game.getPoints());
    }

    @Test
    public void advantage() {
        game.addPoint("player2");
        game.addPoint("player1");
        game.addPoint("player2");
        game.addPoint("player1");
        game.addPoint("player2");
        game.addPoint("player1");
        game.addPoint("player1");

        assertEquals("advantage player1", game.getPoints());

        game.addPoint("player2");
        assertEquals("deuce", game.getPoints());
        game.addPoint("player2");
        game.addPoint("player2");
        assertEquals("advantage player2", game.getPoints());
    }


    @Test
    public void win() {
        game.addPoint("player2");
        game.addPoint("player2");
        game.addPoint("player2");
        game.addPoint("player2");
        assertEquals("winner player2", game.getPoints());
    }
}
