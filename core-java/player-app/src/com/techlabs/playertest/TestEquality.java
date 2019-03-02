package com.techlabs.playertest;

import com.techlabs.player.*;

public class TestEquality {

	public static void main(String args[]) {
		Player p1 = new Player("abc", "xyz", 18);
		Player p2 = new Player("abc", "xyz", 18);
		System.out.println(p1.toString().equals(p2.toString()));
	}
}
