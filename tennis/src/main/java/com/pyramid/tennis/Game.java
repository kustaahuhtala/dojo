package com.pyramid.tennis;

import java.util.HashMap;
import java.util.Map;

public class Game {
	private static final String PLAYER2 = "player2";

	private static final String PLAYER1 = "player1";

	private Map<Integer, String> map;

	private Map<String, Integer> scores;

	public Game() {
		scores = new HashMap<String, Integer>();
		scores.put(PLAYER1, 0);
		scores.put(PLAYER2, 0);

		map = new HashMap<Integer, String>();
		map.put(0, "love");
		map.put(1, "fifteen");
		map.put(2, "thirty");
		map.put(3, "forty");
	}

	public String getPoints() {
		if (scores.get(PLAYER1).equals(scores.get(PLAYER2)) && scores.) {
			
		}
		return map.get(scores.get(PLAYER1)) + " - " + map.get(scores.get(PLAYER2));
	}

	public void addPoint(String player) {
		int score = scores.get(player).intValue() + 1;
		scores.put(player, score);
	}

}
