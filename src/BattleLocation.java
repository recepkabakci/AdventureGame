
public abstract class BattleLocation extends Location {
	protected Monster monster;
	protected String award;
	BattleLocation(Player player,String name,Monster monster,String award) {
		super(player);
		this.monster=monster;
		this.name=name;
		this.award=award;
		
	}

	@Override
	public boolean getLocation() {
		int monsterCount = monster.monsterCount();
		System.out.println("You are in the "+this.getName()+" now.");
		System.out.println("Be carefull!! "+monsterCount+" "+ monster.getName()+" lives in here." );
		System.out.println("<F>ight or <E>scape");
		String selectCase = scan.next();
		selectCase=selectCase.toUpperCase();
		if (selectCase.equals("F")) {
			if(combat(monsterCount)) {
				System.out.println("You have destroyed all enemies in the "+this.getName());
				if(this.award.equals("Wood Stone") && player.getInv().isWoodStone()==false) {
					System.out.println("You won "+this.award+"!!");
					player.getInv().setWoodStone(true);
				}else if(this.award.equals("Water Stone") && player.getInv().isWaterStone()==false){
					System.out.println("You won "+this.award+"!!");
					player.getInv().setWaterStone(true);
				}else if(this.award.equals("Rock Stone") && player.getInv().isRockStone()==false){
					System.out.println("You won "+this.award+"!!");
					player.getInv().setRockStone(true);
				}
				return true;
			}if(player.getHealth()<=0) {
				System.out.println("You are dead!..");
				return false;
			}
			
		}
		return true;
			
		
	}
		
	private boolean combat(int monsterCount) {
		for(int i =0; i<monsterCount;i++) {
			int defaultMonsterHealth = monster.getHealth();
			playerStats();
			enemyStats();
			while(player.getHealth()>0 && monster.getHealth()>0  ) {
				System.out.println("<H>it or <E>scape");
				String selectCase = scan.next();
				selectCase=selectCase.toUpperCase();
				if(selectCase.equals("H")) {
					System.out.println("You hit monster.");
					monster.setHealth((monster.getHealth()-player.getTotalDamage()));
					afterHit();
					if(monster.getHealth()>0) {
						System.out.println();
						System.out.println("Monster hit you");
						player.setHealthy((player.getHealth()-(monster.getDamage()-player.getInv().getArmor())));
						afterHit();
					}
				}else {
					return false;
				}
			}
			if(monster.getHealth() <= 0 && player.getHealth()>0) {
				System.out.println("You killed the enemy!!");
				player.setMoney((player.getMoney()+monster.getAward()));
				System.out.println("Your money: "+player.getMoney());
				monster.setHealth(defaultMonsterHealth);
			}else {
				return false;
			}
			System.out.println("---------------------------");
			}
		return true;
	}
	public void playerStats() {
		System.out.println("Player Stats\n----------");
		System.out.println("Health: "+player.getHealth());
		System.out.println("Damage: "+player.getTotalDamage());
		System.out.println("Money: "+player.getMoney());
		if(player.getInv().getDamage()>0) {
			System.out.println("Weapon: "+player.getInv().getWeaponName());		
		}
		if(player.getInv().getArmor()>0) {
			System.out.println("Shield: "+player.getInv().getShieldName());	
		}
		
	}
	public void enemyStats() {
		System.out.println("\n"+monster.getName()+" Stats\n------------");
		System.out.println("Health: "+monster.getHealth());
		System.out.println("Damage: "+monster.getDamage());
		System.out.println("Award: "+monster.getAward());
	}
	public void afterHit() {
		System.out.println("Player's health: "+player.getHealth());
		System.out.println(monster.getName()+"'s health: "+ monster.getHealth());
		System.out.println();
	}
}
