package com.recepkabakci;
import java.util.Random;

public abstract class Monster {
	private String name;
	private int damage,health,award,maxNumber;
	
	public Monster(String name, int damage, int health, int award, int maxNumber) {
		super();
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.award = award;
		this.maxNumber = maxNumber;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return this.damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealth() {
		return this.health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getAward() {
		return this.award;
	}
	public void setAward(int award) {
		this.award = award;
	}
	public int getMaxNumber() {
		return this.maxNumber;
	}
	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}
	public int monsterCount() {
		Random random = new Random();
		return random.nextInt(this.maxNumber)+1;
	}
	
}
