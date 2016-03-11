package com.pyramid.tennis;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private static final String PLAYER2 = "player2";

    private static final String PLAYER1 = "player1";

    private String result = "love - love";

    private Map<Integer, String> map = new HashMap<Integer, String>();
    {
        map.put(0, "love");
        map.put(1, "fifteen");
        map.put(2, "thirty");
        map.put(3, "forty");
    }

    private Map<String, Integer> scores;

    public Game() {
        scores = new HashMap<String, Integer>();
        scores.put(PLAYER1, 0);
        scores.put(PLAYER2, 0);
    }

    public String getPoints() {
        return result;
    }

    public void addPoint(String string) {
        if (PLAYER1.equals(string)) {
            int score = scores.get(PLAYER1).intValue() + 1;
            scores.put(PLAYER1, score);
        } else if (PLAYER2.equals(string)) {
            int score = scores.get(PLAYER2).intValue() + 1;
            scores.put(PLAYER2, score);
        }
        result = map.get(scores.get(PLAYER1)) + " - " + map.get(scores.get(PLAYER1));
    }

}
