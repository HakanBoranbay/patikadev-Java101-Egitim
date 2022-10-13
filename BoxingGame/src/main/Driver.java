package main;

import util.Fighter;
import util.Match;

public class Driver {

	public static void main(String[] args) {
		
		Fighter fighter1 = new Fighter("Floyd Maywether", 10, 110, 70, 75);
		Fighter fighter2 = new Fighter("Mary Paquaio", 15, 170, 67, 35);
		
		Match match = new Match(fighter1, fighter2, 65, 70);
		
		match.start();
	}
}
