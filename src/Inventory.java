
public class Inventory {
	private boolean waterStone,rockStone,woodStone;
	private String weaponName,shieldName;
	private int damage,armor;
	
	Inventory(){
		this.waterStone=false;
		this.rockStone=false;
		this.woodStone=false;
		this.damage=0;
		this.armor=0;
		this.weaponName=null;
		this.shieldName=null;
	}

	

	public boolean isWaterStone() {
		return this.waterStone;
	}



	public void setWaterStone(boolean waterStone) {
		this.waterStone = waterStone;
	}



	public boolean isRockStone() {
		return this.rockStone;
	}



	public void setRockStone(boolean rockStone) {
		this.rockStone = rockStone;
	}



	public boolean isWoodStone() {
		return this.woodStone;
	}



	public void setWoodStone(boolean woodStone) {
		this.woodStone = woodStone;
	}



	public String getWeaponName() {
		return this.weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public String getShieldName() {
		return this.shieldName;
	}

	public void setShieldName(String shieldName) {
		this.shieldName = shieldName;
	}

	public int getDamage() {
		return this.damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getArmor() {
		return this.armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
}
