package util;

public class Fighter {

	String name;
	int damage;
	int health;
	int weight;
	int defans;
	
	public Fighter(String name, int damage, int health, int weight, int defans) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		if (defans > 75 || defans < 25) {
			this.defans = 25;
		} else {
			this.defans = defans;
		}
	}
	
	public int hit(Fighter foe) {
		
		if (this.health > 0 && foe.health > 0) {
			
			if (isHitSuccesful(foe)) {
				
				System.out.println("***************BANG!***************");
				System.out.println(this.name + " hits " + this.damage + " damage!");
				
				if (foe.health - this.damage < 0) {
					return foe.health = 0;
				}
				
				return foe.health -= this.damage;
				
			} else {
				System.out.println("***************MISS!***************");
				System.out.println(foe.name + " blocked the hit.");
			}
		}
		
		return foe.health;
	}
	
	private boolean isHitSuccesful(Fighter foe) {
		return ((int) (Math.random() * 100)) >= foe.defans;
	}
}
