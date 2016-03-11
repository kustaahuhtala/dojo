package com.pyramid.tennis;

public class Game
{
	private String result = "love - love";
    public String getPoints() {
        return result;
    }

	public void addPoint(String string) {
		if ("player1".equals(string))
		result = "fifteen - love";
		else if("player2".equals(string))
			result = "love - fifteen";
	}

	
}
