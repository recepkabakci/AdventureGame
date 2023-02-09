package com.recepkabakci;
import java.util.Scanner;

public class Player {
	private int damage,health,money,realHealth;
	private String name,cName;
	private Inventory inv;
	Scanner scan = new Scanner(System.in);
	
	public Player(String name) {
		this.name=name;
		this.inv=new Inventory();
	}
	public void selectCha() {
		switch(chaMenu()) {
		case 1:
			initPlayer("Samurai", 5, 21, 15);
			break;
		case 2:
			initPlayer("Archer", 7, 18, 20);	
			break;
		case 3:
			initPlayer("Knight", 8, 24, 5);	
			break;
		default:
			initPlayer("Samurai", 5, 21, 15);
			break;
		}
		System.out.println("Character has been created!!\nName:"+getcName()+"\tDamage:"+getDamage()+"\tHealth:"+getHealth()+"\tMoney:"+getMoney());
		
	}
	
	private int chaMenu() {
		System.out.println("Please select your character!");
		System.out.println("1-Samurai\tDamage:5\tHealth:21\tMoney:15 ");
		System.out.println("2-Archer\tDamage:7\tHealth:18\tMoney:20 ");
		System.out.println("3-Knight\tDamage:8\tHealth:24\tMoney:5 ");
		System.out.println("Your choose: ");
		int chaID = scan.nextInt();
		while (chaID<1 || chaID >3) {
			System.out.println("please select character!");
			chaID = scan.nextInt();
		}
		return chaID;
		}
	public int getTotalDamage() {
		return this.getDamage()+this.getInv().getDamage();
	}
	public void initPlayer(String cName,int damage,int health,int money) {
		setcName(cName);
		setDamage(damage);
		setHealthy(health);
		setMoney(money);
		setRealHealth(health);
		
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
	public void setHealthy(int health) {
		this.health = health;
	}
	public int getMoney() {
		return this.money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getcName() {
		return this.cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Inventory getInv() {
		return this.inv;
	}
	public void setInv(Inventory inv) {
		this.inv = inv;
	}
	public int getRealHealth() {
		return this.realHealth;
	}
	public void setRealHealth(int realHealth) {
		this.realHealth = realHealth;
	}
	
	

}
