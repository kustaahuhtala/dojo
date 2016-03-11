package com.pyramid.tennis;

import java.util.HashMap;
import java.util.Map;

public class Game
{
    private String result = "love - love";

    private Map<Integer, String> map = new HashMap<Integer, String>();

    public String getPoints() {
        return result;
    }

    public void addPoint(String string) {
        if ("player1".equals(string)) {
            result = "fifteen - love";
        }
        else if ("player2".equals(string)) {
            result = "love - fifteen";
        }
    }


}
