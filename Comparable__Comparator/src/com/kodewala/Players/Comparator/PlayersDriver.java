package com.kodewala.Players.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayersDriver {

	public static void main(String[] args) {
		Players player1 = new Players(18, "Virat");
		Players player3 = new Players(07, "Rohit");
		Players player2 = new Players(17, "Devilliers");
		Players player4 = new Players(5, "Rohit");

		List<Players> players = new ArrayList<Players>();
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);

		Collections.sort(players, new PlayersComparatorById());
		for (int i = 0; i < players.size(); i++) {
			Players p = players.get(i);
			System.out.println(p.playersId + " , " + p.playersName);
		}
	}

}
