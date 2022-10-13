package util;

public class Match {

	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}
	
	public void start() {
		
		int coin = coinToss();
		
		if (isWeightCheck()) {
			
			do {
				
				if (coin < 50) {
					f1.hit(f2);
					f2.hit(f1);
				} else {
					f2.hit(f1);
					f1.hit(f2);
				}
				
				printRemainingHealth();
				
			} while (!isMatchOver());
			
			announceWinner();
			
		} else {
			
			System.out.println("Fighter's weights don't match.");
			
		}
	}
	
	private boolean isWeightCheck() {
		return ((this.f1.weight >= minWeight) && (this.f1.weight <= maxWeight) 
				&& (this.f2.weight >= minWeight) && (this.f2.weight <= maxWeight));
	}
	
	private int coinToss() {
		return (int) (Math.random() * 100);
	}
	
	private boolean isMatchOver() {
		if (f1.health == 0 || f2.health == 0) return true;
		
		return false;
	}
	
	private void announceWinner() {
		if (f2.health == 0) {
			System.out.println(f1.name.toUpperCase() + " WON THE MATCH!");
		} else {
			System.out.println(f2.name.toUpperCase() + " WON THE MATCH!");
		}
	}
	
	private void printRemainingHealth() {
		System.out.println(f1.name + "'s ramaining health: " + f1.health);
		System.out.println(f2.name + "'s remaining health: " + f2.health);
		System.out.println();
	}
}
