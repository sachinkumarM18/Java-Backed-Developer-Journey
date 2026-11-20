package com.kodewala.Players.Comparator;

import java.util.Comparator;

public class PlayersComparatorById implements Comparator<Players> {

	@Override
	public int compare(Players p1, Players p2) {
		int result = p1.playersName.compareTo(p2.playersName);
		if (result == 0) {
			return Integer.compare(p1.playersId, p2.playersId);
		}
		return result;
	}

//	@Override
//	public int compare(Players p1, Players p2) {
//		int result = Integer.compare(p1.playersId, p2.playersId);
//		return result;
//	}

}
